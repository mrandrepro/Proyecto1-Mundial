package com.mycompany.proyecto1;

/** Superclase: datos básicos de un deportista. */
public class Atleta {
    private String nombre;
    private int edad;
    private String pais;

    public Atleta(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getPais() { return pais; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | País: " + pais;
    }
}
