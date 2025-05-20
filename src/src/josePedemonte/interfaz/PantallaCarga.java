package josePedemonte.interfaz;

public class PantallaCarga {

    public void mostrar() {
        System.out.println("Cargando...");

        for (int i = 0; i <= 100; i++) {
            esperar(); // simula tiempo de espera
            System.out.print("\rProgreso: " + i + "%");
        }

        System.out.println("\n¡Carga completada!");
    }

    private void esperar() {
        for (long i = 0; i < 500_000; i++) {
            // Bucle vacío para simular espera
        }
    }
}
