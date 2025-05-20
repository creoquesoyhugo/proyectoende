package VivianIscu.Personajes;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud);
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca con espada.");
        enemigo.recibirDanio(fuerza);
    }
}
