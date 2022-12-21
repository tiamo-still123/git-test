package com.example.mapper;

import com.example.pojo.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {

    @Select("select * from Book;")
    List<Book> selectAll();

    @Insert("insert into Book values (null,#{ISBN},#{bookTitle},#{author},#{publishDate},#{category},#{stockNumber},#{price},#{introduction});")
    void add(Book book);
}
