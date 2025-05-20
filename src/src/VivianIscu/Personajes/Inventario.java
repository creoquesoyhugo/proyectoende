package VivianIscu.Personajes;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<String> objetos;

    public Inventario() {
        this.objetos = new ArrayList<>();
    }

    public void agregarObjeto(String objeto) {
        objetos.add(objeto);
    }

    public void mostrarObjetos() {
        System.out.println("Objetos en inventario:");
        for (String o : objetos) {
            System.out.println("- " + o);
        }
    }
}
