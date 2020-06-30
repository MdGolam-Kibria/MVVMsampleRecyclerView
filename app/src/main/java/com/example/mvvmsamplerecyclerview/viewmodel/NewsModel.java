package com.example.mvvmsamplerecyclerview.viewmodel;

import com.example.mvvmsamplerecyclerview.model.News;

public class NewsModel {
    public String title,descr;

    public NewsModel() {
    }

    public NewsModel(News news) {
        this.title = news.title;
        this.descr = news.desc;
    }
}
