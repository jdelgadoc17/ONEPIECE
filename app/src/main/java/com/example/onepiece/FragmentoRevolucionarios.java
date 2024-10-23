package com.example.onepiece;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onepiece.databinding.FragmentFragmentoRevolucionariosBinding;

import java.util.ArrayList;


public class FragmentoRevolucionarios extends Fragment {

    FragmentFragmentoRevolucionariosBinding binding;
    public FragmentoRevolucionarios() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFragmentoRevolucionariosBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RepositorioPersonajes repo = new RepositorioPersonajes();
        ArrayList<Personaje> lista = repo.getLista_revolucionarios();

        GridLayoutManager grid = new GridLayoutManager(getContext(), 1);
        binding.recycRevolucionarios.setLayoutManager(grid);

        revolucionariosAdapter adapter = new revolucionariosAdapter(lista);
        binding.recycRevolucionarios.setAdapter(adapter);
    }
}