package com.geektech.instagramkg.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.geektech.instagramkg.R;
import com.geektech.instagramkg.adapter.UsersAdapter;
import com.geektech.instagramkg.data.Model;
import com.geektech.instagramkg.databinding.FragmentUsersBinding;

import java.util.ArrayList;


public class UsersFragment extends Fragment {
    private FragmentUsersBinding binding;
    ArrayList<Fragment> image_list = new ArrayList<>();
    private AdapterViewPager adapter;
    private UsersAdapter adapters;
    ArrayList<Model> tabList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentUsersBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        glideImage();
        initViewPager();
    }

    private void glideImage() {
        Glide.with(getContext()).load("https://phantom-marca.unid" +
                "adeditorial.es/26536f2ec2564c2120145e4d4da" +
                "92e27/resize/1320/f/jpg/assets/multimedia/" +
                "imagenes/2020/11/27/16064619104296.jpg").circleCrop().into(binding.photoProfile);
        binding.numberFollowers.setText("307M");
        binding.numberPosts.setText("222");

    }

    private void initViewPager() {
        adapter = new AdapterViewPager(getChildFragmentManager(), 0);
        image_list.add(new TabLayoutUsersFragment());
        image_list.add(new TabLayoutUsersFragment());
        adapter.setFragments(image_list);
        binding.viewPagers.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPagers);
        binding.tabLayout.getTabAt(0).setIcon(R.drawable.ic_publication);
        binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_favorites);
    }

    class AdapterViewPager extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragments = new ArrayList<>();

        public AdapterViewPager(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void setFragments(ArrayList<Fragment> fragments) {
            this.fragments = fragments;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
}
