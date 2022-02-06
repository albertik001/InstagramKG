package com.geektech.instagramkg.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.instagramkg.adapter.HomesAdapter;
import com.geektech.instagramkg.data.Model;
import com.geektech.instagramkg.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private HomesAdapter adapter;
    ArrayList<Model> homesList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new HomesAdapter();
        binding.recyclerHome.setAdapter(adapter);
        adapter.setList(loadData());

    }

    private ArrayList<Model> loadData() {
        homesList = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            homesList.add(new Model("Music is the soul of language.\nSeptember", "https://icdn" +
                    ".lenta.ru/images/2021/08/12/11/20210812115738455/square_1280_80d09ab54a22fa12c053a3c1cb7d0359.jpg"));
            homesList.add(new Model("Music is the soul of language.", "https://www.pinkvilla.com/files/styles/gallery-p" +
                    "review/public/kylie_jenner_selfie_1.jpg?itok=DuUjaoaP"));
            homesList.add(new Model("Music is the soul of language.", "https://www.cosmopolitanme.com/cloud/2021/09/09/60939" +
                    "868_356233055029032_2727987522876590928_n.jpg"));
        }
        return homesList;
    }
}