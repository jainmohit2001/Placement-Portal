package com.example.placement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class jobAdapter extends RecyclerView.Adapter<jobAdapter.MyViewHolder> {
    private OnItemClickListener mListener;

    private Context context;
    private ArrayList<job> jobs;

    public jobAdapter(Context c, ArrayList<job> j)
    {
        context = c;
        jobs = j;
    }

    public interface OnItemClickListener
    {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        mListener = listener;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,co_position;
        ImageView ImageUrl;
        Button btn;
        public MyViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            name = itemView.findViewById(R.id.company_name);
            co_position = itemView.findViewById(R.id.company_position);
            ImageUrl = itemView.findViewById(R.id.ImageUrl);
            btn = itemView.findViewById(R.id.checkDetails);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null)
                    {
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION)
                        {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new MyViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(jobs.get(position).getCompany_name());
        holder.co_position.setText(jobs.get(position).getPosition());
        Glide.with(context).load(jobs.get(position).getImageURL()).into(holder.ImageUrl);
    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }
}