package josePedemonte.interfaz;

public class ConsolaMensajes {

    public void mostrarBienvenida() {
        System.out.println("===================================");
        System.out.println("¡Bienvenido al Mundo de Aventuras!");
        System.out.println("===================================\n");
    }

    public void mostrarError(String mensaje) {
        System.out.println("ERROR: " + mensaje);
    }

    public void mostrarInfo(String mensaje) {
        System.out.println("[INFO] " + mensaje);
    }
}
