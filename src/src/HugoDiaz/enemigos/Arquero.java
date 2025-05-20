package HugoDiaz.enemigos;


public class Arquero extends Heroe {
    private int precision;

    public Arquero(String nombre, int nivel, int salud, int precision) {
        super(nombre, nivel, salud, "Hermandad del Bosque");
        this.precision = precision;
    }

    public void dispararFlecha() {
        System.out.println(getNombre() + " dispara con " + precision + "% de precisión!");
    }
}