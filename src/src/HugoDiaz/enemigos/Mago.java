package HugoDiaz.enemigos;


public class Mago extends Heroe {
    private int mana;

    public Mago(String nombre, int nivel, int salud, int mana) {
        super(nombre, nivel, salud, "Círculo de Hechiceros");
        this.mana = mana;
    }

    public void lanzarHechizo(String hechizo) {
        System.out.println(getNombre() + " lanza " + hechizo + " (Mana restante: " + mana + ")");
    }
}