package com.example.onepiece;

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
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFragmentoInfoBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        personajeViewModel = new ViewModelProvider(requireActivity()).get(PersonajeViewModel.class);

        personajeViewModel.getPersonajeSeleccionado().observe(getViewLifecycleOwner(), personaje -> {
            if (personaje != null) {
                // Aquí puedes configurar la vista con los detalles del personaje
                binding.nombreTextView.setText(personaje.getNombre());
                if(personaje.getRecompensa()!=0){
                    binding.recompensaInfo.setText("Recompensa: "+String.valueOf(personaje.getRecompensa()+ " millones de berries"));
                }else{
                    binding.recompensaInfo.setText("Sin recompensa");
                }
                binding.rolInfo.setText(personaje.getRol());
                binding.descripcionInfo.setText(personaje.getDescripcion());
                binding.imgInfo.setImageResource(personaje.getImage());
            }
        });

        binding.buttonBackInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                personajeViewModel.limpiarSeleccion();
                NavController navController = Navigation.findNavController(view);
                navController.popBackStack();
                personajeViewModel.limpiarSeleccion();



            }
        });
    }
}