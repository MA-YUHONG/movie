package com.example.demo.dao;


import com.example.demo.entity.book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface bookMapper {
    java.util.List<book> select();

    int addbook(@Param("content") String paramString1, @Param("date") String paramString2);

    book pool();
}
