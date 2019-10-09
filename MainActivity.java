package com.pranay.mynews;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0548R.layout.activity_main);
        this.recyclerView = (RecyclerView) findViewById(C0548R.C0550id.postlist);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getdata();
    }

    private void getdata() {
        API.getPostserivice().getpostlist().enqueue(new Callback<Posts>() {
            public void onResponse(Call<Posts> call, Response<Posts> response) {
                MainActivity.this.recyclerView.setAdapter(new Postadpter(MainActivity.this, ((Posts) response.body()).getArticles()));
                Toast.makeText(MainActivity.this, "sucess", 0).show();
            }

            public void onFailure(Call<Posts> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error", 0).show();
            }
        });
    }
}
