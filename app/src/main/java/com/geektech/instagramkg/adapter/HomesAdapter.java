package com.geektech.instagramkg.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geektech.instagramkg.data.Model;
import com.geektech.instagramkg.databinding.ItemHomeBinding;
import com.geektech.instagramkg.interfaces.Onclick;

import java.util.ArrayList;

public class HomesAdapter extends RecyclerView.Adapter<HomesAdapter.ViewHolder> {
    ArrayList<Model> homeModel;
    private ItemHomeBinding binding;
    private Context context;

    public HomesAdapter(ArrayList<Model> homeModel, Context context) {
        this.homeModel = homeModel;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(homeModel.get(position), context);
    }

    @Override
    public int getItemCount() {
        return homeModel.size();
    }

    public static class     ViewHolder extends RecyclerView.ViewHolder {
        private ItemHomeBinding binding;

        public ViewHolder(@NonNull ItemHomeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model model, Context context) {
            Glide.with(context).load(model.getImage_post()).into(binding.image);
            binding.textPosts.setText(model.getText_post());

        }
    }
}
