package kr.pile.dy.bookmarket.repository;

import kr.pile.dy.bookmarket.domain.Book;
import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
