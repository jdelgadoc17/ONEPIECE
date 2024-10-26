package com.example.onepiece;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onepiece.databinding.FragmentFragmentoPiratasBinding;

import java.util.ArrayList;


public class FragmentoPiratas extends Fragment {
    FragmentFragmentoPiratasBinding binding;
    private PersonajeViewModel personajeViewModel;
    NavController navController;
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

    /*@Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        personajeViewModel = new ViewModelProvider(requireActivity()).get(PersonajeViewModel.class);

        //COGEMOS LA INFO
        RepositorioPersonajes repo = new RepositorioPersonajes();
        ArrayList<Personaje> listapiratas = repo.getLista_piratas();

        //HACEMOS EL GRID
        GridLayoutManager grid = new GridLayoutManager(getContext(), 1);
        binding.recycPiratas.setLayoutManager(grid);

        //COGEMOS EL ADAPTER
        AdapterPiratas adapter = new AdapterPiratas(listapiratas);
        binding.recycPiratas.setAdapter(adapter);
    }*/

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        personajeViewModel = new ViewModelProvider(requireActivity()).get(PersonajeViewModel.class);
        RepositorioPersonajes repo = new RepositorioPersonajes();
        ArrayList<Personaje> listaPiratas = repo.getLista_piratas();

        AdapterPiratas adapter = new AdapterPiratas(listaPiratas, personajeViewModel);
        binding.recycPiratas.setLayoutManager(new GridLayoutManager(getContext(), 1));
        binding.recycPiratas.setAdapter(adapter);





    }



}