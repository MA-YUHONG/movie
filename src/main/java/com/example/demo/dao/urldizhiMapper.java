package com.example.demo.dao;


import com.example.demo.entity.urldizhi;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface urldizhiMapper {
    java.util.List<urldizhi> select2(@Param("urlid") String paramString);

    urldizhi select3(@Param("id") int paramInt);
}
