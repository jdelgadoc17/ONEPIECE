package com.example.onepiece;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onepiece.databinding.ItemPersonajeBinding;

import java.util.ArrayList;

public class marinesAdapter extends RecyclerView.Adapter<marinesAdapter.InfoViewHolder> {

    private ArrayList<Personaje> lista_personajes;

    public marinesAdapter(ArrayList<Personaje> lista_personajes) {
        this.lista_personajes = lista_personajes;
    }


    @NonNull
    @Override
    public InfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InfoViewHolder(ItemPersonajeBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewHolder holder, int position) {

        Personaje personaje = RepositorioPersonajes.lista_marines.get(position);
        holder.binding.nombreTextView.setText(personaje.getNombre());
        holder.binding.recompensaTextView.setText(String.valueOf(personaje.getRecompensa())); // hay que parsear el int a un string
        holder.binding.rolTextView.setText(personaje.getRol());









    }

    @Override
    public int getItemCount() {

        return RepositorioPersonajes.lista_marines.size();
    }

    //VIEWHOLDER
    public static class InfoViewHolder extends RecyclerView.ViewHolder  {
        ItemPersonajeBinding binding;

        public InfoViewHolder(@NonNull ItemPersonajeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }




    }
}
