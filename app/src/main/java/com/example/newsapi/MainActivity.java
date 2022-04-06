package com.example.newsapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public final String URL = "https://free-news.p.rapidapi.com/v1/search";

    RecyclerView list;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);

        Apiinterface apiinterface = ApiClient.getApiClient().create(Apiinterface.class);
        apiinterface.getData("Elon Musk","en","free-news.p.rapidapi.com","06e5148fadmsh610c7ac484826d8p1f775bjsnc6b1021acc18").enqueue(new Callback<Modeldatum>() {
            @Override
            public void onResponse(Call<Modeldatum> call, Response<Modeldatum> response) {

                if (response.isSuccessful()) {
                    Modeldatum modeldatum = response.body();
                    if (modeldatum.getTotalPages().intValue() > 0) {
                        RecyclerAdapter adapter = new RecyclerAdapter(MainActivity.this, modeldatum.getArticles());
                        list.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        list.setAdapter(adapter);

                    }
                } else {

                    Toast.makeText(MainActivity.this, "failed  "+response.message(), Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<Modeldatum> call, Throwable t) {

            }
        });


    }
}

