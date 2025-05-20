package HugoDiaz.enemigos;


public class Guerrero extends Heroe {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int salud, int fuerza) {
        super(nombre, nivel, salud, "Guardianes del Reino");
        this.fuerza = fuerza;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " golpea con " + fuerza + " de fuerza!");
    }
}
