package HugoDiaz.enemigos;


public class NPC extends Personaje {
    private String dialogo;

    public NPC(String nombre, String dialogo) {
        super(nombre, 1, 100); // NPCs tienen nivel y salud fijos
        this.dialogo = dialogo;
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " dice: \"" + dialogo + "\"");
    }
}