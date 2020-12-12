package com.example.demo.entity;


public class webs {
    private Integer id;

    private int mainid;

    private String laiyuan;

    private String urlid;

    public String toString() {
        return "webs{id=" + this.id + ", mainid=" + this.mainid + ", laiyuan='" + this.laiyuan + '\'' + ", urlid='" + this.urlid + '\'' + '}';
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMainid() {
        return this.mainid;
    }

    public void setMainid(int mainid) {
        this.mainid = mainid;
    }

    public String getLaiyuan() {
        return this.laiyuan;
    }

    public void setLaiyuan(String laiyuan) {
        this.laiyuan = laiyuan;
    }

    public String getUrlid() {
        return this.urlid;
    }

    public void setUrlid(String urlid) {
        this.urlid = urlid;
    }
}
