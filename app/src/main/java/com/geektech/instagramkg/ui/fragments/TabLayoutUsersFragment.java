package com.geektech.instagramkg.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.instagramkg.R;
import com.geektech.instagramkg.adapter.UsersAdapter;
import com.geektech.instagramkg.data.Model;
import com.geektech.instagramkg.databinding.FragmentTabLayoutUsersBinding;

import java.util.ArrayList;


public class TabLayoutUsersFragment extends Fragment {
    private FragmentTabLayoutUsersBinding binding;
    private UsersAdapter adapter;
    ArrayList<Model> tabList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTabLayoutUsersBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new UsersAdapter(getContext(), loadData());
        loadData();
        binding.recyclerUsersTab.setAdapter(adapter);
    }

    private ArrayList<Model> loadData() {
        tabList = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            tabList.add(new Model("https://n1s2.hsmedia.ru/71/32/a6/7132a67166e4ac4ffdc8e1989fb7b4b7/728x909_1_c7a181ebb84d33ed5cabe12b57904e41@1080x1349_0xac120003_16821439051613039458.jpg"));

        }
        return tabList;
    }
}