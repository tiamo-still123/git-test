package com.example.service;

import com.example.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> selectAll();
    void add(Book book);
    void update(Book book);
    void deleteById(int id);
}
