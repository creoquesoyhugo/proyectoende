package josePedemonte.interfaz;

import java.util.Scanner;

public class InterfazJuego {

    private Scanner scanner;
    private PantallaCarga pantallaCarga;
    private MenuPrincipal menu;
    private ConsolaMensajes consola;

    public InterfazJuego() {
        this.scanner = new Scanner(System.in);
        this.pantallaCarga = new PantallaCarga();
        this.menu = new MenuPrincipal(scanner);
        this.consola = new ConsolaMensajes();
    }

    public void iniciar() {
        pantallaCarga.mostrar();
        consola.mostrarBienvenida();
        menu.mostrar();

        // Cierre del scanner si ya no se va a usar más en el resto del juego
        scanner.close();
    }
}
