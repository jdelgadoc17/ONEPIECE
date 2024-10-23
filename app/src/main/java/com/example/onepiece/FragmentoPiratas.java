package com.example.onepiece;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onepiece.databinding.FragmentFragmentoPiratasBinding;

import java.util.ArrayList;


public class FragmentoPiratas extends Fragment {
    FragmentFragmentoPiratasBinding binding;
    public FragmentoPiratas() {
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFragmentoPiratasBinding.inflate(getLayoutInflater());
        return binding.getRoot();




    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //EN ESTE FRAGMENTO

        //COGEMOS LA INFO
        RepositorioPersonajes repo = new RepositorioPersonajes();
        ArrayList<Personaje> listapiratas = repo.getLista_piratas();

        //HACEMOS EL GRID
        GridLayoutManager grid = new GridLayoutManager(getContext(), 1);
        binding.recycPiratas.setLayoutManager(grid);

        //COGEMOS EL ADAPTER
        piratasAdapter adapter = new piratasAdapter(listapiratas);
        binding.recycPiratas.setAdapter(adapter);
    }
}