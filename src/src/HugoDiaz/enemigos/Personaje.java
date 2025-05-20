package HugoDiaz.enemigos;


public abstract class Personaje {
    private String nombre;
    private int nivel;
    private int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    // Métodos comunes
    public void atacar() {
        System.out.println(nombre + " ataca!");
    }

    public abstract void habilidadEspecial();

    // Getters y Setters
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getSalud() { return salud; }
    public void setSalud(int salud) { this.salud = salud; }
}