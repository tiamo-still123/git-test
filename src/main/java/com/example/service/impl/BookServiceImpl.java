package com.example.service.impl;

import com.example.mapper.BookMapper;
import com.example.pojo.Book;
import com.example.service.BookService;
import com.example.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.testng.annotations.Test;

import java.util.List;

public class BookServiceImpl implements BookService {

    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Book> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> books = mapper.selectAll();
        sqlSession.close();
        return books;
    }

    @Override
    public void add(Book book) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        mapper.add(book);
        sqlSession.close();
    }

    @Test
    public void test(){
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.selectAll();
        System.out.println(books);
    }

}
