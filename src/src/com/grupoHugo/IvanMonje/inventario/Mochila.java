package com.grupoHugo.IvanMonje.inventario;

public class Mochila {
    private final int pesoMaximo;
    private int pesoActual;

    public Mochila(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        this.pesoActual = 0;
    }

    public boolean tieneEspacio(int peso) {
        return (pesoActual + peso) <= pesoMaximo;
    }

    public void agregarPeso(int peso) {
        if (tieneEspacio(peso)) {
            pesoActual += peso;
        }
    }

    public void removerPeso(int peso) {
        pesoActual = Math.max(0, pesoActual - peso);
    }

    // Getters
    public int getPesoActual() { return pesoActual; }
    public int getPesoMaximo() { return pesoMaximo; }

    public String getInfoCapacidad() {
        return String.format("%d/%d", pesoActual, pesoMaximo);
    }
}
