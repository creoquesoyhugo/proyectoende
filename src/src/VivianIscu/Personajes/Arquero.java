package VivianIscu.Personajes;

public class Arquero extends Personaje {
    private int precision;

    public Arquero(String nombre, int salud, int precision) {
        super(nombre, salud);
        this.precision = precision;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " dispara una flecha.");
        enemigo.recibirDanio(precision);
    }
}
