package com.example.onepiece;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onepiece.databinding.ItemPersonajeBinding;

import java.util.ArrayList;

public class piratasAdapter extends RecyclerView.Adapter<piratasAdapter.InfoViewHolder> {

    private ArrayList<Personaje> lista_personajes;

    public piratasAdapter(ArrayList<Personaje> lista_personajes) {
        this.lista_personajes = lista_personajes;
    }

    @NonNull
    @Override
    public InfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InfoViewHolder(ItemPersonajeBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewHolder holder, int position) {
        Personaje personaje = RepositorioPersonajes.lista_piratas.get(position);
        holder.binding.nombreTextView.setText(personaje.getNombre());
        holder.binding.recompensaTextView.setText(String.valueOf(personaje.getRecompensa())); // hay que parsear el int a un string
        holder.binding.rolTextView.setText(personaje.getRol());

    }

    @Override
    public int getItemCount() {
        return RepositorioPersonajes.getLista_piratas().size();
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
