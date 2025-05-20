package RodrigoFernandez.items;


public class Arma extends itemsCombate {
    private int danio;
    private String tipo; // Espada, Arco, Hacha, etc.

    public Arma(String nombre, int durabilidad, int nivelRequerido, int danio, String tipo) {
        super(nombre, durabilidad, nivelRequerido);
        this.danio = danio;
        this.tipo = tipo;
    }

    @Override
    public void usar() {
        System.out.println("¡Atacas con " + getNombre() + " causando " + danio + " de daño!");
        reducirDurabilidad(1);
    }

    public int getDanio() {
        return danio;
    }
}