package com.example.onepiece;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onepiece.databinding.FragmentFragmentoFavoritosBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


public class FragmentoFavoritos extends Fragment {

    FragmentFragmentoFavoritosBinding binding;
    private PersonajeViewModel personajeViewModel;
    private AdapterFavoritos adapterFavoritos;

    public FragmentoFavoritos() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFragmentoFavoritosBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        personajeViewModel = new ViewModelProvider(requireActivity()).get(PersonajeViewModel.class);

        binding.recycFavoritos.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterFavoritos = new AdapterFavoritos(new ArrayList<>(), personajeViewModel);
        binding.recycFavoritos.setAdapter(adapterFavoritos);

        //OBSERVADOR
        personajeViewModel.getListaFavoritos().observe(getViewLifecycleOwner(), favoritos -> {
            adapterFavoritos.setListaFavoritos(favoritos);
            adapterFavoritos.notifyDataSetChanged();
        });

        //ITEMTOUCH
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false; // No se necesita mover elementos
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();

                Personaje personajeEliminado = adapterFavoritos.listaFavoritos.get(position); //Cogemos el personaje según su posición


                new AlertDialog.Builder(getContext())
                        .setTitle(getString(R.string.confirmar_eliminacion))
                        .setMessage(getString(R.string.confirmar_eliminacion2) + personajeEliminado.getNombre() + getString(R.string.de_favs))
                        .setPositiveButton(getString(R.string.eliminar), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                adapterFavoritos.eliminarFavorito(position);


                            }
                        })
                        .setNegativeButton(getString(R.string.cancelar), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                adapterFavoritos.notifyItemChanged(position);
                            }
                        }).show();


            }
        }).attachToRecyclerView(binding.recycFavoritos);








    }
}