package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = loadJSONFromAsset(getApplicationContext());
        Log.d("==>","DATA:'" + json + "'");

        // Parse json
        Gson gson = new Gson();

        // ... as array
        Mountain[] mountains = gson.fromJson(json, Mountain[].class);
        Log.d("==>","Size:"+mountains.length);
        Log.d("==>","Item 0"+mountains[0].toString());

        // ... as ArrayList
        Type mountainListType = new TypeToken<ArrayList<Mountain>>(){}.getType();
        ArrayList<Mountain> mountainArrayList = gson.fromJson(json, mountainListType);
        Log.d("==>","Size:"+mountainArrayList.size());
        Log.d("==>","Item 0:" + mountainArrayList.get(0).toString());

        recyclerView = findViewById(R.id.mountain_recycler_view);
        MountainAdapter mountainAdapter = new MountainAdapter(getApplicationContext(),mountainArrayList);
        recyclerView.setAdapter(mountainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    public String loadJSONFromAsset(Context context) {
        String json;
        try {
            InputStream is = context.getAssets().open("mountains.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            int c = is.read(buffer);

            is.close();

            json = new String(buffer, StandardCharsets.UTF_8);


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }
}