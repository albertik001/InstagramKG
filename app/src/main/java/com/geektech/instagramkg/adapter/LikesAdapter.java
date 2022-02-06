package com.geektech.instagramkg.adapter;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geektech.instagramkg.data.Model;
import com.geektech.instagramkg.databinding.ItemHomeBinding;
import com.geektech.instagramkg.databinding.ItemLikesBinding;

import java.util.ArrayList;

public class LikesAdapter extends RecyclerView.Adapter<LikesAdapter.ViewHolder> {
    private ItemLikesBinding binding;
    private Context context;
    ArrayList<Model> likeModel;

        public LikesAdapter(Context context, ArrayList<Model> likeModel) {
        this.context = context;
        this.likeModel = likeModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        binding = ItemLikesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(likeModel.get(position));
    }

    @Override
    public int getItemCount() {
        return likeModel.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ItemLikesBinding binding;

        public ViewHolder(@NonNull ItemLikesBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model model) {
            binding.textLikes.setText(model.getText_likes());
            Glide.with(context).load(model.getImage_profile()).into(binding.imageEndLikes);
            Glide.with(context).load(model.getImage_photo_like()).circleCrop().into(binding.imageStartLikes);
        }
    }
}
