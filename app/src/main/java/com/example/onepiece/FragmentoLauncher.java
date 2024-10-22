package com.example.onepiece;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onepiece.databinding.FragmentFragmentoLauncherBinding;


public class FragmentoLauncher extends Fragment {
    FragmentFragmentoLauncherBinding binding;

    public FragmentoLauncher() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFragmentoLauncherBinding.inflate(getLayoutInflater());
        return binding.getRoot();


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.viewpager.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                switch (position) {
                    case 0:
                        return new FragmentoPiratas();
                    case 1:
                        return new FragmentoMarines();
                    case 2:
                        return new FragmentoRevolucionarios();
                }
            }

            @Override
            public int getItemCount() {
                return 3;
            }
        });
    }
}