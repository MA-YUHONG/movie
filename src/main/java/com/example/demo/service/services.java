package com.example.demo.service;


import okhttp3.Response;

import java.io.*;
import java.net.UnknownHostException;
import okhttp3.RequestBody;
import okhttp3.Request;
import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

import com.example.demo.entity.book;

import java.text.SimpleDateFormat;
import com.example.demo.tools.tool;
import org.apache.ibatis.exceptions.TooManyResultsException;
import com.example.demo.entity.urldizhi;
import com.example.demo.entity.webs;
import com.alibaba.fastjson.JSON;
import com.example.demo.entity.main;
import okhttp3.OkHttpClient;
import com.example.demo.dao.bookMapper;
import com.example.demo.dao.urldizhiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.mainMapper;
import org.springframework.stereotype.Service;

@Service
public class services
{
    @Autowired
    private mainMapper mainMapper;
    @Autowired
    private urldizhiMapper urldizhiMapper;
    @Autowired
    private com.example.demo.dao.websMapper websMapper;
    @Autowired
    private bookMapper bookMapper;
    redis.clients.jedis.Jedis jedis;
    static OkHttpClient clients;

    public services() {
        super();
        this.jedis = new redis.clients.jedis.Jedis("127.0.0.1", 6379);
    }

    public List<main> rands() {
        final String redisRands = this.jedis.get("rands");
        List<main> rands;
        if (redisRands == null) {
            rands = (List<main>)this.mainMapper.rands();
            final String json = JSON.toJSONString((Object)rands);
            this.jedis.setex("rands", 86623, json);
            this.jedis.setex("temp", 28800, "myh");
        }
        else {
            rands = (List<main>)JSON.parseArray(redisRands, (Class)main.class);
        }
        return rands;
    }

    public List<main> newDianshi() {
        final String redisNewdianshi = this.jedis.get("newDianshi");
        List<main> newDianshi;
        if (redisNewdianshi == null) {
            newDianshi = (List<main>)this.mainMapper.newDianshi();
            final String json = JSON.toJSONString((Object)newDianshi);
            this.jedis.setex("newDianshi", 86535, json);
        }
        else {
            newDianshi = (List<main>)JSON.parseArray(redisNewdianshi, (Class)main.class);
        }
        return newDianshi;
    }

    public List<main> newDianying() {
        final String rediseNewdianying = this.jedis.get("newDianying");
        List<main> newDianying;
        if (rediseNewdianying == null) {
            newDianying = (List<main>)this.mainMapper.newDianying();
            final String json = JSON.toJSONString((Object)newDianying);
            this.jedis.setex("newDianying", 86364, json);
        }
        else {
            newDianying = (List<main>)JSON.parseArray(rediseNewdianying, (Class)main.class);
        }
        return newDianying;
    }

    public List<main> newDongman() {
        final String rediseNewdongman = this.jedis.get("newDongman");
        List<main> newDongman;
        if (rediseNewdongman == null) {
            newDongman = (List<main>)this.mainMapper.newDongman();
            final String json = JSON.toJSONString((Object)newDongman);
            this.jedis.setex("newDongman", 86942, json);
        }
        else {
            newDongman = (List<main>)JSON.parseArray(rediseNewdongman, (Class)main.class);
        }
        return newDongman;
    }

    public List<main> newZongyi() {
        final String rediseNewzongyi = this.jedis.get("newZongyi");
        List<main> newZongyi;
        if (rediseNewzongyi == null) {
            newZongyi = (List<main>)this.mainMapper.newZongyi();
            final String json = JSON.toJSONString((Object)newZongyi);
            this.jedis.setex("newZongyi", 86234, json);
        }
        else {
            newZongyi = (List<main>)JSON.parseArray(rediseNewzongyi, (Class)main.class);
        }
        return newZongyi;
    }

    public List<main> newHanju() {
        final String rediseNewhanju = this.jedis.get("newHanju");
        List<main> newHanju;
        if (rediseNewhanju == null) {
            newHanju = (List<main>)this.mainMapper.newHanju();
            final String json = JSON.toJSONString((Object)newHanju);
            this.jedis.setex("newHanju", 86543, json);
        }
        else {
            newHanju = (List<main>)JSON.parseArray(rediseNewhanju, (Class)main.class);
        }
        return newHanju;
    }

    public List<main> randDianying() {
        final String rediseRanddianying = this.jedis.get("randDianying");
        List<main> randDianying;
        if (rediseRanddianying == null) {
            randDianying = (List<main>)this.mainMapper.randDianying();
            final String json = JSON.toJSONString((Object)randDianying);
            this.jedis.setex("randDianying", 86231, json);
        }
        else {
            randDianying = (List<main>)JSON.parseArray(rediseRanddianying, (Class)main.class);
        }
        return randDianying;
    }

    public List<main> maxDianying() {
        final String rediseMaxdianying = this.jedis.get("maxDianying");
        List<main> maxDianying;
        if (rediseMaxdianying == null) {
            maxDianying = (List<main>)this.mainMapper.maxDianying();
            final String json = JSON.toJSONString((Object)maxDianying);
            this.jedis.setex("maxDianying", 86642, json);
        }
        else {
            maxDianying = (List<main>)JSON.parseArray(rediseMaxdianying, (Class)main.class);
        }
        return maxDianying;
    }

    public List<main> randDianshiju() {
        final String rediseRanddianshiju = this.jedis.get("randDianshiju");
        List<main> randDianshiju;
        if (rediseRanddianshiju == null) {
            randDianshiju = (List<main>)this.mainMapper.randDianshiju();
            final String json = JSON.toJSONString((Object)randDianshiju);
            this.jedis.setex("randDianshiju", 86953, json);
        }
        else {
            randDianshiju = (List<main>)JSON.parseArray(rediseRanddianshiju, (Class)main.class);
        }
        return randDianshiju;
    }

    public List<main> maxDianshiju() {
        final String rediseMaxdianshiju = this.jedis.get("maxDianshiju");
        List<main> maxDianshiju;
        if (rediseMaxdianshiju == null) {
            maxDianshiju = (List<main>)this.mainMapper.maxDianshiju();
            final String json = JSON.toJSONString((Object)maxDianshiju);
            this.jedis.setex("maxDianshiju", 86135, json);
        }
        else {
            maxDianshiju = (List<main>)JSON.parseArray(rediseMaxdianshiju, (Class)main.class);
        }
        return maxDianshiju;
    }

    public List<main> randDongman() {
        final String rediseRanddongman = this.jedis.get("randDongman");
        List<main> randDongman;
        if (rediseRanddongman == null) {
            randDongman = (List<main>)this.mainMapper.randDongman();
            final String json = JSON.toJSONString((Object)randDongman);
            this.jedis.setex("randDongman", 86154, json);
        }
        else {
            randDongman = (List<main>)JSON.parseArray(rediseRanddongman, (Class)main.class);
        }
        return randDongman;
    }

    public List<main> maxDongman() {
        final String rediseMaxdongman = this.jedis.get("maxDongman");
        List<main> maxDongman;
        if (rediseMaxdongman == null) {
            maxDongman = (List<main>)this.mainMapper.maxDongman();
            final String json = JSON.toJSONString((Object)maxDongman);
            this.jedis.setex("maxDongman", 86543, json);
        }
        else {
            maxDongman = (List<main>)JSON.parseArray(rediseMaxdongman, (Class)main.class);
        }
        return maxDongman;
    }

    public List<main> randZongyi() {
        final String rediseRandzongyi = this.jedis.get("randZongyi");
        List<main> randZongyi;
        if (rediseRandzongyi == null) {
            randZongyi = (List<main>)this.mainMapper.randZongyi();
            final String json = JSON.toJSONString((Object)randZongyi);
            this.jedis.setex("randZongyi", 86537, json);
        }
        else {
            randZongyi = (List<main>)JSON.parseArray(rediseRandzongyi, (Class)main.class);
        }
        return randZongyi;
    }

    public List<main> maxZongyi() {
        final String rediseMaxzongyi = this.jedis.get("maxZongyi");
        List<main> maxZongyi;
        if (rediseMaxzongyi == null) {
            maxZongyi = (List<main>)this.mainMapper.maxZongyi();
            final String json = JSON.toJSONString((Object)maxZongyi);
            this.jedis.setex("maxZongyi", 86563, json);
        }
        else {
            maxZongyi = (List<main>)JSON.parseArray(rediseMaxzongyi, (Class)main.class);
        }
        return maxZongyi;
    }

    public List<main> randHanju() {
        final String rediseRandhanju = this.jedis.get("randHanju");
        List<main> randHanju;
        if (rediseRandhanju == null) {
            randHanju = (List<main>)this.mainMapper.randHanju();
            final String json = JSON.toJSONString((Object)randHanju);
            this.jedis.setex("randHanju", 86682, json);
        }
        else {
            randHanju = (List<main>)JSON.parseArray(rediseRandhanju, (Class)main.class);
        }
        return randHanju;
    }

    public List<main> maxHanju() {
        final String rediseMaxhanju = this.jedis.get("maxHanju");
        List<main> maxHanju;
        if (rediseMaxhanju == null) {
            maxHanju = (List<main>)this.mainMapper.maxHanju();
            final String json = JSON.toJSONString((Object)maxHanju);
            this.jedis.setex("maxHanju", 86935, json);
        }
        else {
            maxHanju = (List<main>)JSON.parseArray(rediseMaxhanju, (Class)main.class);
        }
        return maxHanju;
    }

    public main select1(final int id) {
        final main select1 = this.mainMapper.select1(id);
        return select1;
    }

    public List<webs> select2(final Integer id) {
        final List<webs> webs = (List<webs>)this.websMapper.select2((int)id);
        return webs;
    }

    public urldizhi select3(final int id) {
        final urldizhi urldizhi = this.urldizhiMapper.select3(id);
        return urldizhi;
    }

    public webs select4(final String urlid) throws TooManyResultsException {
        final webs webs = this.websMapper.select4(urlid);
        return webs;
    }

    public main select5(final int mainid) {
        final main main = this.mainMapper.select5(mainid);
        return main;
    }

    public List<main> select6(final String str, final int page) {
        final String[] split = str.split("-");
        List<main> list = null;
        if (split.length == 1) {
            if (split[0].equals("dsj") || split[0].equals("dh") || split[0].equals("zy") || split[0].equals("hj")) {
                list = (List<main>)this.mainMapper.select6(split[0], page * 45);
            }
            if (split[0].equals("dy")) {
                list = (List<main>)this.mainMapper.select7(page * 45);
            }
        }
        if (split.length == 2) {
            if (split[0].equals("dsj")) {
                if (split[1].equals("guochan")) {
                    list = (List<main>)this.mainMapper.select8("国产剧", page * 45);
                }
                if (split[1].equals("xianggang")) {
                    list = (List<main>)this.mainMapper.select8("香港剧", page * 45);
                }
                if (split[1].equals("taiwai")) {
                    list = (List<main>)this.mainMapper.select8("台湾剧", page * 45);
                }
                if (split[1].equals("riben")) {
                    list = (List<main>)this.mainMapper.select8("日本剧", page * 45);
                }
                if (split[1].equals("hanguo")) {
                    list = (List<main>)this.mainMapper.select8("韩国剧", page * 45);
                }
                if (split[1].equals("oumei")) {
                    list = (List<main>)this.mainMapper.select8("欧美剧", page * 45);
                }
                if (tool.isInteger(split[1])) {
                    list = (List<main>)this.mainMapper.select9("剧", split[1], page * 45);
                }
            }
            if (split[0].equals("dy")) {
                if (split[1].equals("zainan")) {
                    list = (List<main>)this.mainMapper.select8("灾难", page * 45);
                }
                if (split[1].equals("dongzuo")) {
                    list = (List<main>)this.mainMapper.select8("动作", page * 45);
                }
                if (split[1].equals("xiju")) {
                    list = (List<main>)this.mainMapper.select8("喜剧", page * 45);
                }
                if (split[1].equals("aiqing")) {
                    list = (List<main>)this.mainMapper.select8("爱情", page * 45);
                }
                if (split[1].equals("kehuan")) {
                    list = (List<main>)this.mainMapper.select8("科幻", page * 45);
                }
                if (split[1].equals("kongbu")) {
                    list = (List<main>)this.mainMapper.select8("恐怖", page * 45);
                }
                if (split[1].equals("zhanzheng")) {
                    list = (List<main>)this.mainMapper.select8("战争", page * 45);
                }
                if (split[1].equals("jingsong")) {
                    list = (List<main>)this.mainMapper.select8("惊悚", page * 45);
                }
                if (split[1].equals("zuian")) {
                    list = (List<main>)this.mainMapper.select8("罪案", page * 45);
                }
                if (split[1].equals("xuanyi")) {
                    list = (List<main>)this.mainMapper.select8("悬疑", page * 45);
                }
                if (split[1].equals("juqing")) {
                    list = (List<main>)this.mainMapper.select8("剧情", page * 45);
                }
                if (split[1].equals("jilu")) {
                    list = (List<main>)this.mainMapper.select8("记录", page * 45);
                }
                if (tool.isInteger(split[1])) {
                    list = (List<main>)this.mainMapper.select10(split[1], page * 45);
                }
                if (split[1].equals("riben")) {
                    list = (List<main>)this.mainMapper.select11("日本", page * 45);
                }
                if (split[1].equals("oumei")) {
                    list = (List<main>)this.mainMapper.select11("欧美", page * 45);
                }
                if (split[1].equals("taiwan")) {
                    list = (List<main>)this.mainMapper.select11("台湾", page * 45);
                }
                if (split[1].equals("dalu")) {
                    list = (List<main>)this.mainMapper.select11("大陆", page * 45);
                }
                if (split[1].equals("hanguo")) {
                    list = (List<main>)this.mainMapper.select11("韩国", page * 45);
                }
                if (split[1].equals("xianggang")) {
                    list = (List<main>)this.mainMapper.select11("香港", page * 45);
                }
            }
            if (split[0].equals("dh")) {
                if (split[1].equals("oumei")) {
                    list = (List<main>)this.mainMapper.select12("动漫", "欧美", page * 45);
                }
                if (split[1].equals("xianggang")) {
                    list = (List<main>)this.mainMapper.select12("动漫", "香港", page * 45);
                }
                if (split[1].equals("taiwan")) {
                    list = (List<main>)this.mainMapper.select12("动漫", "台湾", page * 45);
                }
                if (split[1].equals("dalu")) {
                    list = (List<main>)this.mainMapper.select12("动漫", "大陆", page * 45);
                }
                if (split[1].equals("hanguo")) {
                    list = (List<main>)this.mainMapper.select12("动漫", "韩国", page * 45);
                }
                if (split[1].equals("riben")) {
                    list = (List<main>)this.mainMapper.select12("动漫", "日本", page * 45);
                }
                if (tool.isInteger(split[1])) {
                    list = (List<main>)this.mainMapper.select9("动漫", split[1], page * 45);
                }
            }
            if (split[0].equals("zy")) {
                if (split[1].equals("xiezhen")) {
                    list = (List<main>)this.mainMapper.select8("福利", page * 45);
                }
                if (split[1].equals("lunli")) {
                    list = (List<main>)this.mainMapper.select8("伦理", page * 45);
                }
                if (split[1].equals("dali")) {
                    list = (List<main>)this.mainMapper.select12("综艺", "大陆", page * 45);
                }
                if (split[1].equals("oumei")) {
                    list = (List<main>)this.mainMapper.select12("综艺", "欧美", page * 45);
                }
                if (split[1].equals("xianggang")) {
                    list = (List<main>)this.mainMapper.select12("综艺", "香港", page * 45);
                }
                if (split[1].equals("taiwan")) {
                    list = (List<main>)this.mainMapper.select12("综艺", "台湾", page * 45);
                }
                if (split[1].equals("hanguo")) {
                    list = (List<main>)this.mainMapper.select12("综艺", "韩国", page * 45);
                }
                if (split[1].equals("riben")) {
                    list = (List<main>)this.mainMapper.select12("综艺", "日本", page * 45);
                }
            }
            if (split[0].equals("hj") && tool.isInteger(split[1])) {
                list = (List<main>)this.mainMapper.select9("韩国剧", split[1], page * 45);
            }
        }
        return list;
    }

    public List<main> search(final String str) {
        final List<main> search = (List<main>)this.mainMapper.search(str);
        return search;
    }

    public List<main> newList() {
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        final Date date = new Date(System.currentTimeMillis());
        final List<main> main = (List<main>)this.mainMapper.newList(formatter.format(date));
        return main;
    }

    public List<urldizhi> select13(final String urlid) {
        final List<urldizhi> urlList = (List<urldizhi>)this.urldizhiMapper.select2(urlid);
        return urlList;
    }

    public List<book> selectBook() {
        final List<book> book = (List<book>)this.bookMapper.select();
        return book;
    }

    public String addbook(final String content) {
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final Date date = new Date(System.currentTimeMillis());
        final int count = this.bookMapper.addbook(content, formatter.format(date));
        if (count == 1) {
            return "true";
        }
        return "false";
    }

//    public void pool() {
//        new Timer("testTimer").schedule((TimerTask)new services.services$1(this), 0L, 600000L);
//    }

    public void writei(final HttpServletRequest request) {
        final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final String date = df.format(new Date());
        String ips = request.getHeader("x-forwarded-for");
        if (ips == null || ips.length() == 0 || "unknown".equalsIgnoreCase(ips)) {
            ips = request.getHeader("Proxy-Client-IP");
        }
        if (ips == null || ips.length() == 0 || "unknown".equalsIgnoreCase(ips)) {
            ips = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ips == null || ips.length() == 0 || "unknown".equalsIgnoreCase(ips)) {
            ips = request.getRemoteAddr();
        }
        final String browserVersion = null;
        final String header = request.getHeader("user-agent");
        System.out.println(header);
        final String city = this.getIpInfo(ips);
        writeFile(date + " " + ips + "\t" + city + "\t" + header);
        Thread.currentThread().interrupt();
    }

    public String getIpInfo(String ips) {
        if (ips.equals("0:0:0:0:0:0:0:1") || ips == "0:0:0:0:0:0:0:1") {
            ips = "12.12.12.12";
        }
        try {
            final String url = "https://sp0.baidu.com/8aQDcjqpAAV3otqbppnN2DJv/api.php?query=" + ips + "&co=&resource_id=6006&t=1478145571872&ie=utf8&oe=gbk&cb=op_aladdin_callback&format=json&tn=baidu&cb=jQuery110204481323950024978_1478145442947&_=1478145442951";
            final String tempString = Get(url);
            final int start = tempString.indexOf("[{");
            final int end = tempString.indexOf("}]");
            final String result = tempString.substring(start + 1, end + 1);
            final JSONObject d = JSONObject.parseObject(result);
            final String city = d.getString("location");
            return city;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeFile(final String content) {
        final String saveFile = "/movie/ip.txt";
        final File file = new File(saveFile);
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            if (!file.exists()) {
                fos = new FileOutputStream(file);
            }
            else {
                fos = new FileOutputStream(file, true);
            }
            osw = new OutputStreamWriter(fos, "utf-8");
            osw.write(content + "\n");
        }
        catch (Exception e) {
            e.printStackTrace();
            try {
                if (osw != null) {
                    osw.close();
                }
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        finally {
            try {
                if (osw != null) {
                    osw.close();
                }
            }
            catch (IOException e3) {
                e3.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            }
            catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    public static String Get(final String url) throws IOException {
        final Request request = new Request.Builder().url(url).method("GET", (RequestBody)null).build();
        Response response;
        try {
            response = services.clients.newCall(request).execute();
        }
        catch (UnknownHostException e) {
            return null;
        }
        return response.body().string();
    }

    static /* synthetic */ bookMapper access$000(final services x0) {
        return x0.bookMapper;
    }

    static {
        services.clients = new OkHttpClient();
    }
}
