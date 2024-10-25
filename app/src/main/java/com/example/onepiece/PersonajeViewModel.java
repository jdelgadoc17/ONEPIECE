package com.example.onepiece;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PersonajeViewModel extends ViewModel {
    final MutableLiveData<Boolean> debeNavegar = new MutableLiveData<>(false);

    private final MutableLiveData<Personaje> personajeSeleccionado = new MutableLiveData<>();

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

}
