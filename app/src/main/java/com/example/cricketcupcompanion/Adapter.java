package com.example.cricketcupcompanion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public ArrayList<Team> teams;

    public Adapter(ArrayList <Team> teams){
        this.teams = teams;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txt;
        public ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.textView);
            img = itemView.findViewById(R.id.imageView);
        }
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View tv = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.teamitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(tv);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.txt.setText(teams.get(position).getTeamName());
        holder.img.setImageResource(teams.get(position).getFlagID());
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }


}
