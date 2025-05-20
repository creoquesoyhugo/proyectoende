package HugoDiaz.personajes;


public class Heroe extends Personaje {
    private String faccion;

    public Heroe(String nombre, int nivel, int salud, String faccion) {
        super(nombre, nivel, salud);
        this.faccion = faccion;
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa ¡Inspiración aliada!");
    }

    public String getFaccion() { return faccion; }
}