package com.example.mvvmsamplerecyclerview.model;

public class News {
    public String title;
    public String desc;

    public News() {
    }

    public News(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
