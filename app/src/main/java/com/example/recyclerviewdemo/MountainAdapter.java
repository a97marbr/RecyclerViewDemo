package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.MountainViewHolder>{

    Context ctx;
    ArrayList<Mountain> mountains;

    public MountainAdapter(Context c, ArrayList<Mountain> mountainArrayList){
        ctx=c;
        mountains=mountainArrayList;
    }

    @NonNull
    @Override
    public MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MountainViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder {

        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
