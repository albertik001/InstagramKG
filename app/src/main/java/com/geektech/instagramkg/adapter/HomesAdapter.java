package com.geektech.instagramkg.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.geektech.instagramkg.data.Model;
import com.geektech.instagramkg.databinding.ItemHomeBinding;
import com.geektech.instagramkg.interfaces.Onclick;

import java.util.ArrayList;

public class HomesAdapter extends RecyclerView.Adapter<HomesAdapter.ViewHolder> {
    ArrayList<Model> homeModel = new ArrayList<>();
    private ItemHomeBinding binding;
//    private Context context;

//    public HomesAdapter(ArrayList<Model> homeModel, Context context) {
//        this.homeModel = homeModel;
//        this.context = context;
//    }
    public void setList(ArrayList<Model> models){
        this.homeModel = models;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        context = parent.getContext();
        binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(homeModel.get(position));
    }

    @Override
    public int getItemCount() {
        return homeModel.size();
    }

    public static class  ViewHolder extends RecyclerView.ViewHolder {
        private ItemHomeBinding binding;

            public ViewHolder(@NonNull ItemHomeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model model) {
            Glide.with(binding.image).load(model.getImage_post()).
                    listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            binding.homeLoad.setVisibility(View.VISIBLE);
                            Log.e("tag", "tag");
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            binding.homeLoad.setVisibility(View.VISIBLE);
                            return false;
                        }
                    })
        .into(binding.image);
            binding.textPosts.setText(model.getText_post());

        }
    }
}
