package com.example.demo.dao;

import com.example.demo.entity.main;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface mainMapper {
    java.util.List<main> rands();

    java.util.List<main> newDianshi();

    java.util.List<main> hotDianshi();

    List<main> newDianying();

    List<main> newDongman();

    List<main> newZongyi();

    List<main> newHanju();

    List<main> randDianying();

    List<main> maxDianying();

    List<main> randDianshiju();

    List<main> maxDianshiju();

    List<main> randDongman();

    List<main> maxDongman();

    List<main> randZongyi();

    List<main> maxZongyi();

    List<main> randHanju();

    List<main> maxHanju();

    main select1(@Param("id") int paramInt);

    main select5(int paramInt);

    List<main> select6(@Param("type") String paramString, @Param("start") int paramInt);

    List<main> select7(@Param("start") int paramInt);

    List<main> select8(@Param("type") String paramString, @Param("start") int paramInt);

    List<main> select9(@Param("type1") String paramString1, @Param("type2") String paramString2, @Param("start") int paramInt);

    List<main> select10(@Param("type") String paramString, @Param("start") int paramInt);

    List<main> select11(@Param("place") String paramString, @Param("start") int paramInt);

    List<main> select12(@Param("type") String paramString1, @Param("place") String paramString2, @Param("start") int paramInt);

    List<main> search(@Param("str") String paramString);

    List<main> newList(@Param("str") String paramString);
}
