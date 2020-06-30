package com.example.mvvmsamplerecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmsamplerecyclerview.adapter.CustomAdapter;
import com.example.mvvmsamplerecyclerview.databinding.ActivityMainBinding;
import com.example.mvvmsamplerecyclerview.viewmodel.NewsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    CustomAdapter customAdapter;
    List<NewsModel> newsModelsList;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.recycle.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView = findViewById(R.id.recycle);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsModelsList = new ArrayList<>();
        customAdapter = new CustomAdapter(newsModelsList);
       // recyclerView.setAdapter(customAdapter);
        activityMainBinding.recycle.setAdapter(customAdapter);
        setData();
    }

    private void setData() {
        NewsModel newsModel = new NewsModel();
        newsModel.title = "golam kibria";
        newsModel.descr = "hi i am golam kibria from dhaka";
        newsModelsList.add(newsModel);

        }
}