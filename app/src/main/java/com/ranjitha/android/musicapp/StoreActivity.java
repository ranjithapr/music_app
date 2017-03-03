package com.ranjitha.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Button now_playing = (Button) findViewById(R.id.now_playing);
        now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(StoreActivity.this, MainActivity.class);
                StoreActivity.this.startActivity(myIntent);
            }
        });

        Button detail = (Button) findViewById(R.id.detail);
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(StoreActivity.this, DetailActivity.class);
                StoreActivity.this.startActivity(myIntent);
            }
        });


        Button search = (Button) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(StoreActivity.this, SearchActivity.class);
                StoreActivity.this.startActivity(myIntent);
            }
        });

        Button list = (Button) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(StoreActivity.this, ListActivity.class);
                StoreActivity.this.startActivity(myIntent);
            }
        });

    }


}

