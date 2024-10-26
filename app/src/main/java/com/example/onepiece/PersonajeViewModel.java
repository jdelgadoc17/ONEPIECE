package com.example.onepiece;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class PersonajeViewModel extends ViewModel {
    final MutableLiveData<Boolean> debeNavegar = new MutableLiveData<>(false);

    private final MutableLiveData<Personaje> personajeSeleccionado = new MutableLiveData<>();
    private final MutableLiveData<ArrayList<Personaje>> listaFavoritos = new MutableLiveData<>(new ArrayList<>());

    public void seleccionarPersonaje(Personaje personaje){
        personajeSeleccionado.setValue(personaje);
        debeNavegar.setValue(true); // Indica que se debe navegar

    }

    public LiveData<Personaje>getPersonajeSeleccionado(){
        return personajeSeleccionado;
    }

    public void limpiarSeleccion() {
        personajeSeleccionado.setValue(null); // Limpia la selección
    }

    public LiveData<ArrayList<Personaje>> getListaFavoritos() {
        return listaFavoritos;
    }

    public void toggleFavorito(Personaje personaje) {
        ArrayList<Personaje> favoritos = listaFavoritos.getValue();
        if (favoritos != null) {
            if (favoritos.contains(personaje)) {
                Log.e("PersonajeViewModel", "Personaje dentro");
                favoritos.remove(personaje);
                Log.e("PersonajeViewModel", "Personaje REMOVE");

            } else {
                favoritos.add(personaje);
            }
            listaFavoritos.setValue(favoritos); // Actualiza la lista
        }
    }


}
