package josePedemonte.interfaz;

import java.util.Scanner;

public class InterfazJuego {

    private final Scanner scanner;
    private PantallaCarga pantallaCarga;
    private MenuPrincipal menu;
    private ConsolaMensajes consola;

    public InterfazJuego() {
        scanner = new Scanner(System.in);
        pantallaCarga = new PantallaCarga();
        menu = new MenuPrincipal(scanner);
        consola = new ConsolaMensajes();
    }

    public void iniciar() {
        pantallaCarga.mostrar();
        consola.mostrarBienvenida();
        menu.mostrar();
    }

}
