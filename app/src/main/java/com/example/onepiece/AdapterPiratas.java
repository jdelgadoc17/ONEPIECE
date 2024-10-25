package com.example.onepiece;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import com.example.onepiece.databinding.ItemPersonajeBinding;
import java.util.ArrayList;

public class AdapterPiratas extends RecyclerView.Adapter<AdapterPiratas.InfoViewHolder> {

    private ArrayList<Personaje> lista_personajes;
    private PersonajeViewModel personajeViewModel;

    public AdapterPiratas(ArrayList<Personaje> lista_personajes, PersonajeViewModel personajeViewModel) {
        this.lista_personajes = lista_personajes;
        this.personajeViewModel = personajeViewModel;
    }

    @NonNull
    @Override
    public InfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InfoViewHolder(ItemPersonajeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewHolder holder, int position) {
        // SET
        Personaje personaje = lista_personajes.get(holder.getAdapterPosition());
        holder.binding.nombreTextView.setText(personaje.getNombre());
        holder.binding.recompensaTextView.setText(String.valueOf(personaje.getRecompensa()));
        holder.binding.rolTextView.setText(personaje.getRol());
        holder.binding.descripcionTextView.setText(personaje.getDescripcion());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                personajeViewModel.seleccionarPersonaje(personaje); // Asigna el personaje seleccionado
                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.fragmentoInfo); // Navegar al fragmento de info
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista_personajes.size();
    }

    // VIEWHOLDER
    public static class InfoViewHolder extends RecyclerView.ViewHolder {
        ItemPersonajeBinding binding;

        public InfoViewHolder(@NonNull ItemPersonajeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}