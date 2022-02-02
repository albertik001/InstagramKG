package com.geektech.instagramkg.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geektech.instagramkg.data.Model;
import com.geektech.instagramkg.databinding.ItemTabPhotoBinding;

import java.util.ArrayList;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.CountViewHolder> {
    private ItemTabPhotoBinding binding;
    private Context context;

    public UsersAdapter(Context context, ArrayList<Model> tabList) {
        this.context = context;
        this.tabList = tabList;
    }

    ArrayList<Model> tabList;

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        binding = ItemTabPhotoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(tabList.get(position));
    }

    @Override
    public int getItemCount() {
        return tabList.size();
    }

    class CountViewHolder extends RecyclerView.ViewHolder {
        public CountViewHolder(@NonNull ItemTabPhotoBinding binding) {
            super(binding.getRoot());
        }

        public void bind(Model model) {
            Glide.with(context).load(model.getImage_tab_layout()).into(binding.imageTabLayout);
        }
    }
}
