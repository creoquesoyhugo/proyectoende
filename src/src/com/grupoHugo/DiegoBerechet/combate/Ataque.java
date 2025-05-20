package com.grupoHugo.DiegoBerechet.combate;

public class Ataque {
    private int daño;

    public Ataque(int daño) {
        this.daño = daño;
    }

    public void ejecutarAtaque() {
        System.out.println("Ataque ejecutado con " + daño + " de daño.");
    }
}
