package com.grupoHugo.DiegoBerechet.combate;

public class Defensa {
    private int resistencia;

    public Defensa(int resistencia) {
        this.resistencia = resistencia;
    }

    public void bloquear() {
        System.out.println("Defensa activada con " + resistencia + " puntos.");
    }
}
