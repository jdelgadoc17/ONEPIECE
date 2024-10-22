package com.example.onepiece;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onepiece.databinding.ItemPersonajeBinding;

public static class InfoViewHolder extends RecyclerView.ViewHolder  {

    ItemPersonajeBinding binding;

    public InfoViewHolder(@NonNull ItemPersonajeBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }




}
