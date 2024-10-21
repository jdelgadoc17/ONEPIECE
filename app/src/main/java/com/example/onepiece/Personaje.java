package com.example.onepiece;

public class Personaje {

    private String nombre;
    private String rol;
    private int recompensa;
    private String frutaDelDiablo;

    // Constructor
    public Personaje(String nombre, String rol, int recompensa, String frutaDelDiablo) {
        this.nombre = nombre;
        this.rol = rol;
        this.recompensa = recompensa;
        this.frutaDelDiablo = frutaDelDiablo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public String getFrutaDelDiablo() {
        return frutaDelDiablo;
    }

    public void setFrutaDelDiablo(String frutaDelDiablo) {
        this.frutaDelDiablo = frutaDelDiablo;
    }

    // Método para mostrar información del personaje
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Rol: " + rol + "\n" +
                "Recompensa: " + recompensa + " millones de berries\n" +
                "Fruta del Diablo: " + frutaDelDiablo;
    }
}
