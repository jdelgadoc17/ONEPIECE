package com.example.onepiece;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onepiece.databinding.FragmentFragmentoMarinesBinding;

import java.util.ArrayList;


public class FragmentoMarines extends Fragment {
    FragmentFragmentoMarinesBinding binding;
    public FragmentoMarines() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFragmentoMarinesBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RepositorioPersonajes repo = new RepositorioPersonajes();
        ArrayList<Personaje> lista = repo.getLista_marines();

        GridLayoutManager grid = new GridLayoutManager(getContext(), 1);
        binding.recycMarines.setLayoutManager(grid);


        AdapterMarines adapter = new AdapterMarines(lista);
        binding.recycMarines.setAdapter(adapter);
    }
}