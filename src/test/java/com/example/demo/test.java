package com.example.demo;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    @Test
    public void test1() {
        int start = 6000;
        int end = 7000;


        System.out.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        System.out.println("<urlset>");
        for (int i = start; i <= end; i++) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = simpleDateFormat.format(date);
            System.out.println("<url>");
            System.out.println("<loc>http://www.aoklite.com/info/" + i + ".html</loc>");
            System.out.println("<lastmod>" + time + "</lastmod>");
            System.out.println("<changefreq>weekly</changefreq>");
            System.out.println("<priority>0.8</priority>");
            System.out.println("</url>");
        }
        System.out.println("</urlset>");


        System.out.println("\n\n---------------------------\n\n");
        for (int i = start; i <= end; i++) {
            System.out.println("http://www.aoklite.com/info/" + i + ".html");
        }
    }

    @Test
    public void test2() {
        for (int i = 1; i <=200; i++) {


            System.out.println("\t\t<img src=\"https://aoklite.oss-cn-beijing.aliyuncs.com/movie/"+i+".png\">");
        }
    }
}
