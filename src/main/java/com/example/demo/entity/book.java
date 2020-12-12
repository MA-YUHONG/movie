package com.example.demo.entity;

public class book {
    private int id;

    private String content;

    private String data;

    public String toString() {
        return "book{id=" + this.id + ", content='" + this.content + '\'' + ", data='" + this.data + '\'' + '}';
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
