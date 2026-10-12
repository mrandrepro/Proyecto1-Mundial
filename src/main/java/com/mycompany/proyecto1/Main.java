package com.mycompany.proyecto1;

/** Clase principal: conecta el MVC. */
public class Main {
    public static void main(String[] args) {
        ControladorMundial modelo = new ControladorMundial();
        VistaMundial vista = new VistaMundial();

        int opcion;
        do {
            opcion = vista.menu();
            switch (opcion) {
                case 1:
                    modelo.registrar(vista.pedirCompetidor());
                    vista.mostrar("Competidor registrado.");
                    break;
                case 2:
                    String nombre = vista.pedirNombre();
                    int puntos = vista.pedirPuntos();
                    boolean medalla = vista.pedirMedalla();
                    if (modelo.actualizarRanking(nombre, puntos, medalla)) {
                        vista.mostrar("Ranking actualizado.");
                    } else {
                        vista.mostrar("No se encontró al competidor.");
                    }
                    break;
                case 3:
                    if (modelo.cantidad() == 0) {
                        vista.mostrar("No hay competidores registrados.");
                    }
                    for (Competidor c : modelo.listarPorRanking()) {
                        vista.mostrar(c.toString());
                    }
                    break;
                case 0:
                    vista.mostrar("¡Hasta luego!");
                    break;
                default:
                    vista.mostrar("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
