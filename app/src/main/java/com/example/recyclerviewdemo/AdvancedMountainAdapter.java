package com.example.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdvancedMountainAdapter extends RecyclerView.Adapter<AdvancedMountainAdapter.MountainViewHolder>{
    private ArrayList<Mountain> mountains;

    public AdvancedMountainAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advanced_item,parent,false);
        return new MountainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MountainViewHolder holder, int position) {
        Mountain mountain = mountains.get(position);
        holder.mountain_name.setText(mountain.getName());
        holder.mountain_height_m.setText(mountain.getSize()+"m");
        holder.mountain_image.setBackgroundResource(R.mipmap.ic_mountain_round);
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder{
        ImageView mountain_image;
        TextView mountain_name;
        TextView mountain_height_m;
        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);
            mountain_image = itemView.findViewById(R.id.mountain_image);
            mountain_name = itemView.findViewById(R.id.mountain_name);
            mountain_height_m = itemView.findViewById(R.id.mountain_height_m);
        }
    }
}
