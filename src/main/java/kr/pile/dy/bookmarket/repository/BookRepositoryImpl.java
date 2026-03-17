package kr.pile.dy.bookmarket.repository;

import kr.pile.dy.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository{
    private List<Book> listOfBooks = new ArrayList<Book>();
    
    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setBookId("isbn1001");
        book1.setName("스프링부트 완전정복");
        book1.setDescription("‘개념-실습-프로젝트’로 끝내는 쉽고 빠른 스프링 부트! 스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구다." +
                " 이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있다." +
                "단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있다. " +
                "개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있다.");
        book1.setPublisher("길벗 캠퍼스");
        book1.setCategory("IT 전문서");
        book1.setAuthor("송미영");
        book1.setUnitPrice(new BigDecimal(35000));
        book1.setReleaseDate("2024/12/31");

        Book book2 = new Book();
        book2.setBookId("isbn1002");
        book2.setName("데이터베이스 개론");
        book2.setDescription("기초 개념부터 빅데이터까지 큰 흐름이 보이는 데이터베이스 교과서다. 마인드맵으로 생소한 개념 간의 관계를 한눈에 보여주고, 친근한 예와 비유를 들어 명료하게 풀어내, 데이터베이스 기본기를 탄탄히 다져준다. 3판에서는 빅데이터 표현 기술이 더 추가되었고, 다양한 시험의 최신 기술 경향에 맞게 연습문제를 보강하였다. 또한 부록을 통해 최신 버전의 오라클뿐만 아니라 설치하지 않아도 사용할 수 있는 Live SQL을 활용해 데이터베이스를 직접 구축해볼 수 있게 안내하였다.");
        book2.setPublisher("한빛 아카데미");
        book2.setCategory("IT 교육교재");
        book2.setAuthor("우재남");
        book2.setUnitPrice(new BigDecimal(29000));
        book2.setReleaseDate("2022/01/15");

        Book book3 = new Book();
        book3.setBookId("isbn1003");
        book3.setName("박태웅의 AI 강의 2026 ");
        book3.setDescription("챗GPT 등장 이후 AI는 운영체제이자 파트너, 그리고 휴머노이드로 확장되며 삶과 산업 전반을 빠르게 바꾸고 있다. 독자들이 ‘인공지능 분야 최고의 책’으로 꼽은 『박태웅의 AI 강의』 시리즈가 최신 흐름을 반영한 『박태웅의 AI 강의 2026』으로 돌아왔다.");
        book3.setPublisher("한빛 비즈");
        book3.setCategory("컴퓨터/모바일");
        book3.setAuthor("박태웅");
        book3.setUnitPrice(new BigDecimal(20700));
        book3.setReleaseDate("2026/03/20");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }


    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }
}
