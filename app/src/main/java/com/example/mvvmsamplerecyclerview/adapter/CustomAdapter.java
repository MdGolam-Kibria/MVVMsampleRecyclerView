package com.example.mvvmsamplerecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmsamplerecyclerview.databinding.NewsBinding;
import com.example.mvvmsamplerecyclerview.viewmodel.NewsModel;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {
    List<NewsModel> newsModelsList;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<NewsModel> newsList) {
        this.newsModelsList = newsList;
    }

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (layoutInflater==null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater,parent,false);
        return new CustomView(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView holder, int position) {
//            News news = newsList.get(position);
//            holder.title.setText(news.getTitle());
//            holder.desc.setText(news.getDesc());
        NewsModel newsModel = newsModelsList.get(position);
        holder.bind(newsModel);
    }

    @Override
    public int getItemCount() {
        return newsModelsList.size();
    }

    public class CustomView extends RecyclerView.ViewHolder {
       // TextView title, desc;
        private NewsBinding newsBinding;//this class from innar_layout.xml own create class for dataBinding


        public CustomView(NewsBinding newsBinding) {
            super(newsBinding.getRoot());
//            title = itemView.findViewById(R.id.titleVal);
//            desc = itemView.findViewById(R.id.descVal);
            this.newsBinding = newsBinding;
        }
        public void bind(NewsModel newsModel){
            this.newsBinding.setNewsview(newsModel);
        }
        public NewsBinding getNewsBinding(){
            return newsBinding;
        }
    }
}
