package RodrigoFernandez.items;

public abstract class itemsCombate {
    private String nombre;
    private int durabilidad;
    private int nivelRequerido;

    public itemsCombate(String nombre, int durabilidad, int nivelRequerido) {
        this.nombre = nombre;
        this.durabilidad = durabilidad;
        this.nivelRequerido = nivelRequerido;
    }

    public abstract void usar();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void reducirDurabilidad(int cantidad) {
        this.durabilidad -= cantidad;
        if (this.durabilidad < 0) this.durabilidad = 0;
    }
}