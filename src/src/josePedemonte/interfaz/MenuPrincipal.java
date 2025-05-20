package josePedemonte.interfaz;

import java.util.Scanner;

public class MenuPrincipal {

    private final Scanner scanner;

    public MenuPrincipal(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrar() {
        int opcion;

        do {
            System.out.println("====== MENÚ PRINCIPAL ======");
            System.out.println("1. Ver Personajes");
            System.out.println("2. Ver Inventario");
            System.out.println("3. Iniciar Combate");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Mostrando personajes...");
                    break;
                case 2:
                    System.out.println("Mostrando inventario...");
                    break;
                case 3:
                    System.out.println("Iniciando combate...");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}
