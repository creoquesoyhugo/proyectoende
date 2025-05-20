package VivianIscu.Personajes;


public class Mago extends Personaje {
    private Hechizo hechizo;

    public Mago(String nombre, int salud, Hechizo hechizo) {
        super(nombre, salud);
        this.hechizo = hechizo;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " lanza " + hechizo.getNombre());
        enemigo.recibirDanio(hechizo.getPoder());
    }
}
