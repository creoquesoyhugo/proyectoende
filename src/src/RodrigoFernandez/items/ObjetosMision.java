package RodrigoFernandez.items;

public class ObjetosMision {
    private String nombre;
    private String descripcion;
    private boolean entregado;

    public ObjetosMision(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.entregado = false;
    }

    public void entregar() {
        this.entregado = true;
        System.out.println("¡Has entregado " + nombre + "!");
    }

    public boolean isEntregado() {
        return entregado;
    }
}