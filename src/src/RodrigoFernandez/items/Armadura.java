package RodrigoFernandez.items;



public class Armadura extends itemsCombate {
    private int defensa;
    private String material; // Cuero, Acero, Mágico, etc.

    public Armadura(String nombre, int durabilidad, int nivelRequerido, int defensa, String material) {
        super(nombre, durabilidad, nivelRequerido);
        this.defensa = defensa;
        this.material = material;
    }

    @Override
    public void usar() {
        System.out.println("¡Te proteges con " + getNombre() + " (" + material + ")!");
        reducirDurabilidad(1);
    }

    public int getDefensa() {
        return defensa;
    }
}