package josePedemonte.interfaz;

import java.util.Scanner;

import static josePedemonte.interfaz.PantallaCarga.esperar;

public class InterfazJuego {

    private Scanner scanner;

    public InterfazJuego() {
        scanner = new Scanner(System.in);
    }

    public void mostrarPantallaCarga() {
        System.out.println("Cargando juego...");
        for (int i = 0; i <= 100; i++) {
            esperar();
            System.out.print("\rProgreso: " + i + "%");
        }
        System.out.println("\n¡Carga completa!");
    }
}