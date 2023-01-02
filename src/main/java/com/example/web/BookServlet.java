package com.example.web;

import com.alibaba.fastjson.JSON;
import com.example.pojo.Book;
import com.example.service.BookService;
import com.example.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/book/*")
public class BookServlet extends BaseServlet{
    private BookService bookService = new BookServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        List<Book> books = bookService.selectAll();
        String jsonString = JSON.toJSONString(books);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void addBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String line = req.getReader().readLine();
        Book book = JSON.parseObject(line, Book.class);
        bookService.add(book);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("bingo");
    }
    public void updateBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String line = req.getReader().readLine();
        System.out.println(line);
        Book book = JSON.parseObject(line, Book.class);
        bookService.update(book);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("bingo");
    }

    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String id = req.getParameter("id");
        bookService.deleteById(Integer.parseInt(id));
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("bingo");
    }
}
