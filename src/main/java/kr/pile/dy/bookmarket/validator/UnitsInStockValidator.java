package kr.pile.dy.bookmarket.validator;

import kr.pile.dy.bookmarket.domain.Book;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.math.BigDecimal;

@Component
public class UnitsInStockValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Book.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Book book = (Book) target;
        BigDecimal unitPrice = book.getUnitPrice();
        long unitsInStock = book.getUnitsInStock();
        if (unitPrice != null && unitPrice.intValue() >= 10000 && unitsInStock > 100) {
            errors.rejectValue("unitsInStock", "UnitsInStockValidator.message", "가격 10,000 이상은 등록할 수 없습니다.");
        }
    }
}
