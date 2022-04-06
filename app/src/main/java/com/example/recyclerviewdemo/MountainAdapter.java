package com.example.recyclerviewdemo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.item, parent, false);
        return new MountainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MountainViewHolder holder, int position) {
        Mountain mountain = mountains.get(position);
        holder.mountain_name.setText(mountain.getName());
        holder.mountain_location.setText(mountain.getLocation());
        holder.mountain_height_m.setText(""+mountain.getSize());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder {

        TextView mountain_name;
        TextView mountain_location;
        TextView mountain_height_m;

        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);
            mountain_name = itemView.findViewById(R.id.mountain_name);
            mountain_location = itemView.findViewById(R.id.mountain_location);
            mountain_height_m = itemView.findViewById(R.id.mountain_height_m);
        }
    }
}
