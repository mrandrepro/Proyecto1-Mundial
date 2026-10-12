package com.mycompany.proyecto1;

import java.util.ArrayList;
import java.util.Comparator;

/** Controlador: gestiona la lista de competidores. */
public class ControladorMundial {
    private ArrayList<Competidor> competidores = new ArrayList<>();

    public void registrar(Competidor c) {
        competidores.add(c);
    }

    public Competidor buscarPorNombre(String nombre) {
        for (Competidor c : competidores) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public boolean actualizarRanking(String nombre, int puntos, boolean medalla) {
        Competidor c = buscarPorNombre(nombre);
        if (c == null) return false;
        c.actualizarRanking(puntos, medalla);
        return true;
    }

    /** Lista ordenada por ranking (mejor primero). */
    public ArrayList<Competidor> listarPorRanking() {
        ArrayList<Competidor> copia = new ArrayList<>(competidores);
        copia.sort(Comparator.comparingInt(Competidor::getRanking));
        return copia;
    }

    public int cantidad() { return competidores.size(); }
}
