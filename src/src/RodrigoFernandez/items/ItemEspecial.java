package RodrigoFernandez.items;

public class ItemEspecial {
    private String nombre;
    private String efecto;
    private int usosRestantes;

    public ItemEspecial(String nombre, String efecto, int usos) {
        this.nombre = nombre;
        this.efecto = efecto;
        this.usosRestantes = usos;
    }

    public void activar() {
        if (usosRestantes > 0) {
            System.out.println("¡Usas " + nombre + ": " + efecto + "!");
            usosRestantes--;
        } else {
            System.out.println("¡" + nombre + " no tiene más usos!");
        }
    }

    public int getUsosRestantes() {
        return usosRestantes;
    }
}