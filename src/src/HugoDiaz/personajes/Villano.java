package HugoDiaz.personajes;


public class Villano extends Personaje {
    private String recompensa;

    public Villano(String nombre, int nivel, int salud, String recompensa) {
        super(nombre, nivel, salud);
        this.recompensa = recompensa;
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " lanza ¡Ataque oscuro!");
    }

    public String getRecompensa() { return recompensa; }
}