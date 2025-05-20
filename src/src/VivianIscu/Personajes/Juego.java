package VivianIscu.Personajes;


public class Juego {
    public static void main(String[] args) {
        Guerrero g = new Guerrero("Thor", 100, 25);
        Mago m = new Mago("Gandalf", 80, new Hechizo("Fuego", 30));
        Arquero a = new Arquero("Legolas", 90, 20);

        g.atacar(m);
        m.atacar(a);
        a.atacar(g);
    }
}
