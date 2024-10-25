package com.example.onepiece;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class PersonajeViewModel {


    private final MutableLiveData<Personaje> personajeSeleccionado = new MutableLiveData<>();

    public void seleccionarPersonaje(Personaje personaje){
        personajeSeleccionado.setValue(personaje);
    }

    public LiveData<Personaje>getPersonajeSeleccionado(){
        return personajeSeleccionado;
    }

}
