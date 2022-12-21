package com.example.pojo;

/*
*       id
        ISBN
        bookTitle
        author
        publishDate
        category
        stockNumber
        price
        introduction
* */

import java.util.Date;

public class Book {
    private Integer id;
    private String ISBN;
    private String bookTitle;
    private String author;
    private String publishDate;
    private String category;
    private Integer stockNumber;
    private Integer price;
    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Memo{" +
                "id=" + id +
                ", ISBN='" + ISBN + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                ", category='" + category + '\'' +
                ", stockNumber=" + stockNumber +
                ", price=" + price +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
