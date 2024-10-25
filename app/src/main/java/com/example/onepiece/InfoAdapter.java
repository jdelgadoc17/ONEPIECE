package com.example.onepiece;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onepiece.databinding.ItemPersonajeBinding;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {


    @NonNull
    @Override
    public InfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InfoViewHolder(ItemPersonajeBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewHolder holder, int position) {

        Personaje personaje = RepositorioPersonajes.personajes.get(position);
        holder.binding.nombreTextView.setText(personaje.getNombre()); //nombre
        holder.binding.recompensaTextView.setText(personaje.getRecompensa()); // recompensa
        holder.binding.rolTextView.setText(personaje.getRol()); //rol

    }

    @Override
    public int getItemCount() {
        return RepositorioPersonajes.personajes.size();
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
