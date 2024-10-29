package com.example.onepiece;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onepiece.databinding.FragmentFragmentoInfoBinding;


public class FragmentoInfo extends Fragment {

    FragmentFragmentoInfoBinding binding;
    private PersonajeViewModel personajeViewModel;

    public FragmentoInfo() {
        // Constructor vacío requerido
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFragmentoInfoBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        personajeViewModel = new ViewModelProvider(requireActivity()).get(PersonajeViewModel.class);

        // Verifica la orientación del dispositivo
        int orientation = getResources().getConfiguration().orientation;

        personajeViewModel.getPersonajeSeleccionado().observe(getViewLifecycleOwner(), personaje -> {
            if (personaje != null) {
                if (binding.nombreTextView != null) {
                    binding.nombreTextView.setText(personaje.getNombre());
                }
                if (orientation == Configuration.ORIENTATION_PORTRAIT && binding.recompensaInfo != null) {
                    binding.recompensaInfo.setText(personaje.getRecompensa() != 0
                            ? getString(R.string.recompensa) + personaje.getRecompensa() + getString(R.string.millones)
                            : getString(R.string.sin_recompensa));
                }
                if (binding.rolInfo != null) {
                    binding.rolInfo.setText(personaje.getRol());
                }
                if (binding.descripcionInfo != null && orientation == Configuration.ORIENTATION_PORTRAIT) {
                    binding.descripcionInfo.setText(personaje.getDescripcion());
                }
                if (binding.imgInfo != null) {
                    binding.imgInfo.setImageResource(personaje.getImage());
                }
            }
        });

        // Configura el botón de regreso solo en portrait
        if (orientation == Configuration.ORIENTATION_PORTRAIT && binding.buttonBackInfo != null) {
            binding.buttonBackInfo.setOnClickListener(v -> {
                personajeViewModel.limpiarSeleccion();
                NavController navController = Navigation.findNavController(view);
                navController.popBackStack();
            });
        }
    }
}