package com.example.newsapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    MainActivity mainActivity;
    List<Artical> datalist;

    public RecyclerAdapter(MainActivity mainActivity, List<Artical> datalist) {
        this.datalist= datalist;
        this.mainActivity=mainActivity;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.news_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        holder.score.setText( datalist.get(position).getScore().toString());
        holder.author.setText( datalist.get(position).getAuthor());
        holder.clean_url.setText(datalist.get(position).getCleanUrl());
        holder.country.setText(datalist.get(position).getCountry());
        holder.link.setText(datalist.get(position).getLink());
        holder.language.setText(datalist.get(position).getLanguage());
        holder.published_date.setText(datalist.get(position).getPublishedDate());
        holder.published_date_precision.setText(datalist.get(position).getPublishedDatePrecision());
        holder.rank.setText(datalist.get(position).getRank().toString());
        holder.rights.setText(datalist.get(position).getRights());
        holder.summary.setText(datalist.get(position).getSummary());
        holder.title.setText(datalist.get(position).getTitle());
        holder.topic.setText(datalist.get(position).getTopic());
        holder.twitter.setText(datalist.get(position).getTwitterAccount());

        Glide.with(mainActivity).load(datalist.get(position).getMedia()).into(holder.media);


    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id,score,author,clean_url,country,is_opinion,language,link,published_date,published_date_precision,rank,rights,summary,title,topic,twitter;
        ImageView media;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id=itemView.findViewById(R.id.id);
            score=itemView.findViewById(R.id.score);
            author=itemView.findViewById(R.id.author);
            clean_url=itemView.findViewById(R.id.clean_url);
            country=itemView.findViewById(R.id.country);
            is_opinion=itemView.findViewById(R.id.id_opinion);
            language=itemView.findViewById(R.id.language);
            link=itemView.findViewById(R.id.link);
            published_date=itemView.findViewById(R.id.published_date);
            published_date_precision=itemView.findViewById(R.id.published_precision);
            rank=itemView.findViewById(R.id.rank);
            rights=itemView.findViewById(R.id.rights);
            summary=itemView.findViewById(R.id.summary);
            title=itemView.findViewById(R.id.title);
            topic=itemView.findViewById(R.id.topic);
            twitter=itemView.findViewById(R.id.twitter);
            media=itemView.findViewById(R.id.media);

        }
    }

}
