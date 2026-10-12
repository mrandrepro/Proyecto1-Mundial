package com.mycompany.proyecto1;

/** Subclase: ciclista que participa en el mundial. */
public class Competidor extends Atleta {
    private int ranking;      // 1 = mejor posición
    private double estatura;  // metros
    private double peso;      // kilogramos

    public Competidor(String nombre, int edad, String pais,
                      int ranking, double estatura, double peso) {
        super(nombre, edad, pais);
        this.ranking = ranking;
        this.estatura = estatura;
        this.peso = peso;
    }

    public int getRanking() { return ranking; }
    public double getEstatura() { return estatura; }
    public double getPeso() { return peso; }

    /** Sobrecarga 1: cada 10 puntos mejora una posición en el ranking. */
    public void actualizarRanking(int puntosObtenidos) {
        int mejora = puntosObtenidos / 10;
        ranking = Math.max(1, ranking - mejora);
    }

    /** Sobrecarga 2: igual que la anterior, más bonificación con if anidado. */
    public void actualizarRanking(int puntosObtenidos, boolean ganoMedalla) {
        int mejora = puntosObtenidos / 10;
        if (ganoMedalla) {
            if (puntosObtenidos >= 50) {
                mejora += 5;   // medalla + muchos puntos
            } else {
                mejora += 2;   // medalla + pocos puntos
            }
        } else {
            if (puntosObtenidos >= 50) {
                mejora += 1;   // sin medalla pero gran puntaje
            }
        }
        ranking = Math.max(1, ranking - mejora);
    }

    /** Sobreescritura: reutiliza toString() de la superclase con super. */
    @Override
    public String toString() {
        return super.toString() + " | Ranking: " + ranking
                + " | Estatura: " + estatura + " m | Peso: " + peso + " kg";
    }
}
