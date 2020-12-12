package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.book;
import com.example.demo.entity.main;
import com.example.demo.entity.urldizhi;
import com.example.demo.entity.webs;
import com.example.demo.service.services;

import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class mainController {
    @Autowired
    private services services;

    @ApiOperation("主界面")
    @RequestMapping({"index"})
    public ModelAndView index1(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        java.util.List<main> rands = this.services.rands();
        java.util.List<main> newDianying = this.services.newDianying();
        java.util.List<main> newDianshi = this.services.newDianshi();
        List<main> newDongman = this.services.newDongman();
        List<main> newZongyi = this.services.newZongyi();
        List<main> newHanju = this.services.newHanju();
        List<main> randDianying = this.services.randDianying();
        List<main> maxDianying = this.services.maxDianying();
        List<main> randDianshiju = this.services.randDianshiju();
        List<main> maxDianshiju = this.services.maxDianshiju();
        List<main> randDongman = this.services.randDongman();
        List<main> maxDongman = this.services.maxDongman();
        List<main> randZongyi = this.services.randZongyi();
        List<main> maxZongyi = this.services.maxZongyi();
        List<main> randHanju = this.services.randHanju();
        List<main> maxHanju = this.services.maxHanju();
        modelAndView.addObject("rands", rands);
        modelAndView.addObject("newDianying", newDianying);
        modelAndView.addObject("newDianshi", newDianshi);
        modelAndView.addObject("newDongman", newDongman);
        modelAndView.addObject("newZongyi", newZongyi);
        modelAndView.addObject("newHanju", newHanju);
        modelAndView.addObject("randDianying", randDianying);
        modelAndView.addObject("maxDianying", maxDianying);
        modelAndView.addObject("randDianshiju", randDianshiju);
        modelAndView.addObject("maxDianshiju", maxDianshiju);
        modelAndView.addObject("randDongman", randDongman);
        modelAndView.addObject("maxDongman", maxDongman);
        modelAndView.addObject("randZongyi", randZongyi);
        modelAndView.addObject("maxZongyi", maxZongyi);
        modelAndView.addObject("randHanju", randHanju);
        modelAndView.addObject("maxHanju", maxHanju);
        modelAndView.addObject("tit", "111");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping({"/info/{id}.html"})
    public ModelAndView index2(@PathVariable("id") int id, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            main main = this.services.select1(id);
            List<webs> webs = this.services.select2(main.getId());
            List<urldizhi> urldizhi1 = this.services.select13(((webs) webs.get(0)).getUrlid());
            if (webs.size() == 2) {
                List<urldizhi> urldizhi2 = this.services.select13(((webs) webs.get(1)).getUrlid());
                modelAndView.addObject("urldizhi2", urldizhi2);
            } else {
                modelAndView.addObject("urldizhi2", null);
            }
            List<main> rands = this.services.rands();
            modelAndView.addObject("main", main);
            modelAndView.addObject("urldizhi1", urldizhi1);
            modelAndView.addObject("rands", rands);
        } catch (Exception e) {
            modelAndView.setViewName("404");
            return modelAndView;
        }
        modelAndView.setViewName("movieInfo");
        return modelAndView;
    }

    @RequestMapping({"/play/{id}.html"})
    public ModelAndView index3(@PathVariable("id") int id, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            webs webs;
            urldizhi m3u8 = this.services.select3(id);
            try {
                webs = this.services.select4(m3u8.getUrlid());
            } catch (TooManyResultsException e) {
                modelAndView.setViewName("404");
                return modelAndView;
            }
            main main = this.services.select5(webs.getMainid());
            modelAndView.addObject("m3u8", m3u8);
            modelAndView.addObject("main", main);
        } catch (Exception e) {
            modelAndView.setViewName("404");
            return modelAndView;
        }
        modelAndView.setViewName("bofang");
        return modelAndView;
    }

    @RequestMapping(value = {"/list/{str}.html"}, method = {RequestMethod.GET})
    public ModelAndView index4(@PathVariable("str") final String str, final HttpServletRequest request) {
        String title = "电影";
        if (str.contains("dsj")) {
            title = "电视剧";
        } else if (str.contains("dh")) {
            title = "动漫";
        } else if (str.contains("hj")) {
            title = "韩剧";
        } else if (str.contains("zy")) {
            title = "综艺";
        }
        ModelAndView modelAndView = new ModelAndView();
        try {
            List<main> main = this.services.select6(str, 0);
            List<main> randDianying = this.services.randDianying();
            List<main> randDianshiju = this.services.randDianshiju();
            List<main> randDongman = this.services.randDongman();
            List<main> randHanju = this.services.randHanju();
            modelAndView.addObject("title", title);
            modelAndView.addObject("randDianshiju", randDianshiju);
            modelAndView.addObject("randDianying", randDianying);
            modelAndView.addObject("randDongman", randDongman);
            modelAndView.addObject("randHanju", randHanju);
            modelAndView.addObject("main", main);
        } catch (Exception e) {
            modelAndView.setViewName("404");
            return modelAndView;
        }
        modelAndView.setViewName("movieList");
        return modelAndView;
    }

    @RequestMapping(value = {"/loadmore"}, method = {RequestMethod.POST})
    @ResponseBody
    public String index5(String str, int page) {
        List<main> main = this.services.select6(str, page);
        String ret = JSON.toJSON(main).toString();
        return ret;
    }

    @RequestMapping({"/search"})
    public ModelAndView index6(String str, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        if (str.equals("") || str.equals(null)) {
            modelAndView.setViewName("404");
            return modelAndView;
        }
        List<main> main = this.services.search(str);
        List<main> randDianying = this.services.randDianying();
        List<main> randDianshiju = this.services.randDianshiju();
        List<main> randDongman = this.services.randDongman();
        List<main> randHanju = this.services.randHanju();
        modelAndView.addObject("randDianshiju", randDianshiju);
        modelAndView.addObject("randDianying", randDianying);
        modelAndView.addObject("randDongman", randDongman);
        modelAndView.addObject("randHanju", randHanju);
        modelAndView.addObject("main", main);
        modelAndView.setViewName("movieList");
        return modelAndView;
    }

    @RequestMapping({"/new.html"})
    public ModelAndView index7(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        List<main> newList = this.services.newList();
        List<main> randDianying = this.services.randDianying();
        List<main> randDianshiju = this.services.randDianshiju();
        List<main> randDongman = this.services.randDongman();
        List<main> randHanju = this.services.randHanju();
        modelAndView.addObject("randDianshiju", randDianshiju);
        modelAndView.addObject("randDianying", randDianying);
        modelAndView.addObject("randDongman", randDongman);
        modelAndView.addObject("randHanju", randHanju);
        modelAndView.addObject("main", newList);
        modelAndView.setViewName("movieList");
        return modelAndView;
    }

    @RequestMapping({"/book.html"})
    public ModelAndView index8(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        List<book> book = this.services.selectBook();
        modelAndView.addObject("book", book);
        modelAndView.setViewName("book");
        return modelAndView;
    }

    @RequestMapping({"/addbook.html"})
    @ResponseBody
    public String index9(String content) {
        if (content.length() > 100)
            return "false";
        String date = this.services.addbook(content);
        return date;
    }
}