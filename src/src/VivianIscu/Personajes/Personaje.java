package VivianIscu.Personajes;


public abstract class Personaje {
    protected String nombre;
    protected int salud;

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public abstract void atacar(Personaje enemigo);

    public void recibirDanio(int cantidad) {
        salud -= cantidad;
        System.out.println(nombre + " recibió " + cantidad + " de daño. Salud restante: " + salud);
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }
}
