package com.mycompany.proyecto1;

import java.util.Scanner;

/** Vista de consola. */
public class VistaMundial {
    private Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("\n=== MUNDIAL DE CICLISMO DE PISTA - CALI ===");
        System.out.println("1. Registrar competidor");
        System.out.println("2. Actualizar ranking");
        System.out.println("3. Ver clasificación");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return leerEntero();
    }

    public Competidor pedirCompetidor() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = leerEntero();
        System.out.print("País: ");
        String pais = sc.nextLine();
        System.out.print("Ranking inicial: ");
        int ranking = leerEntero();
        System.out.print("Estatura (m): ");
        double estatura = leerDecimal();
        System.out.print("Peso (kg): ");
        double peso = leerDecimal();
        return new Competidor(nombre, edad, pais, ranking, estatura, peso);
    }

    public String pedirNombre() {
        System.out.print("Nombre del competidor: ");
        return sc.nextLine();
    }

    public int pedirPuntos() {
        System.out.print("Puntos obtenidos: ");
        return leerEntero();
    }

    public boolean pedirMedalla() {
        System.out.print("¿Ganó medalla? (s/n): ");
        return sc.nextLine().trim().equalsIgnoreCase("s");
    }

    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }

    private int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Número inválido, intente de nuevo: ");
            }
        }
    }

    private double leerDecimal() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.print("Número inválido, intente de nuevo: ");
            }
        }
    }
}
