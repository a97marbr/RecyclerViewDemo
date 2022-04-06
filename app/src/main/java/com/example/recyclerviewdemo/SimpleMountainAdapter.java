package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleMountainAdapter extends RecyclerView.Adapter<SimpleMountainAdapter.SimpleMountainViewHolder>{
    Context ctx;
    private ArrayList<Mountain> mountains;

    public SimpleMountainAdapter(Context ctx,ArrayList<Mountain> mountains) {
        this.ctx = ctx;
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public SimpleMountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.simple_item, parent, false);
        return new SimpleMountainAdapter.SimpleMountainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleMountainViewHolder holder, int position) {
        Mountain mountain = mountains.get(position);
        holder.mountain_name.setText(mountain.getName());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class SimpleMountainViewHolder extends RecyclerView.ViewHolder{
        TextView mountain_name;

        public SimpleMountainViewHolder(@NonNull View itemView) {
            super(itemView);
            mountain_name = itemView.findViewById(R.id.mountain_name_txt);
        }
    }
}
