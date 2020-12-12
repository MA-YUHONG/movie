package com.example.demo.dao;


import com.example.demo.entity.webs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface websMapper {
    java.util.List<webs> select2(@Param("id") int paramInt);

    webs select4(@Param("urlid") String paramString);
}
