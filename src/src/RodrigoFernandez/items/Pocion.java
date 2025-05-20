package RodrigoFernandez.items;


public class Pocion {
    private String nombre;
    private int curacion;
    private int cantidad; // Cantidad disponible

    public Pocion(String nombre, int curacion, int cantidad) {
        this.nombre = nombre;
        this.curacion = curacion;
        this.cantidad = cantidad;
    }

    public void consumir() {
        if (cantidad > 0) {
            System.out.println("¡Bebes " + nombre + " y recuperas " + curacion + " HP!");
            cantidad--;
        } else {
            System.out.println("¡No tienes más pociones de " + nombre + "!");
        }
    }

    public int getCantidad() {
        return cantidad;
    }
}
