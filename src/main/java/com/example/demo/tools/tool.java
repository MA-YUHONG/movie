package com.example.demo.tools;

import java.util.regex.Pattern;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class tool
{
    public static String dianying;

    public tool() {
        super();
    }

    public static String Base64(final String str) {
        String encode = null;
        try {
            encode = Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encode;
    }

    public static boolean isInteger(final String str) {
        final Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    static {
        tool.dianying = "<div class=\"ui-title fn-clear\">\n                            <h3>电影索引分类</h3>\n                            <span><a href=\"/dy.html\" target=\"_blank\">更多</a></span>\n                        </div>\n                        <div class=\"ui-cnt\">\n                            <dl class=\"indexing-item\">\n                                <dt>按类型：</dt>\n\n\n\n                                <dd>  <a href=\"/zainanpian/\" target=\"_blank\">灾难</a> </dd>\n\n                                <dd>  <a href=\"/dongzuopian/\" target=\"_blank\">动作</a> </dd>\n\n                                <dd>  <a href=\"/xijupian/\" target=\"_blank\">喜剧</a> </dd>\n\n                                <dd>  <a href=\"/aiqingpian/\" target=\"_blank\">爱情</a> </dd>\n\n                                <dd>  <a href=\"/kehuanpian/\" target=\"_blank\">科幻</a> </dd>\n\n                                <dd>  <a href=\"/kongbupian/\" target=\"_blank\">恐怖</a> </dd>\n\n                                <dd>  <a href=\"/zhanzhengpian/\" target=\"_blank\">战争</a> </dd>\n\n                                <dd>  <a href=\"/jingsongpian/\" target=\"_blank\">惊悚</a> </dd>\n\n                                <dd>  <a href=\"/zuianpian/\" target=\"_blank\">罪案</a> </dd>\n\n                                <dd>  <a href=\"/xuanyipian/\" target=\"_blank\">悬疑</a> </dd>\n\n                                <dd>  <a href=\"/juqingpian/\" target=\"_blank\">剧情</a> </dd>\n\n                                <dd>  <a href=\"/jilupian/\" target=\"_blank\">纪录</a> </dd>\n\n\n                            </dl>\n                            <dl class=\"indexing-item\">\n                                <dt>按地区：</dt>\n                                <dd><a href=\"/search1.asp?searchword=欧美&searchtype=2\">美国</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=香港&searchtype=2\">香港</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=台湾&searchtype=2\">台湾</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=大陆&searchtype=2\">大陆</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=韩国&searchtype=2\">韩国</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=日本&searchtype=2\">日本</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=其它&searchtype=2\">泰国</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=其它&searchtype=2\">内地</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=欧美&searchtype=2\">德国</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=欧美&searchtype=2\">法国</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=欧美&searchtype=2\">英国</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=其它&searchtype=2\">其它</a></dd>\t\t\t\t\t\t</dl>\n                            <dl class=\"indexing-item\">\n                                <dt>按年代：</dt>\n                                <dd><a href=\"/search1.asp?searchword=2013&searchtype=3\">2013</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2012&searchtype=3\">2012</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2011&searchtype=3\">2011</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2010&searchtype=3\">2010</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2009&searchtype=3\">2009</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2008&searchtype=3\">2008</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2007&searchtype=3\">2007</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2006&searchtype=3\">2006</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2005&searchtype=3\">2005</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2004&searchtype=3\">2004</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2003&searchtype=3\">2003</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2002&searchtype=3\">2002</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2001&searchtype=3\">2001</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=2000&searchtype=3\">2000</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=1999&searchtype=3\">1999</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=1998&searchtype=3\">1998</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=1997&searchtype=3\">1997</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=1996&searchtype=3\">1996</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=1995&searchtype=3\">1995</a></dd>\n                                <dd><a href=\"/search1.asp?searchword=1994&searchtype=3\">1994</a></dd>\n                            </dl>\n                        </div>";
    }
}
