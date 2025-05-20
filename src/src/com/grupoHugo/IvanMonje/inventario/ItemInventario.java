package com.grupoHugo.IvanMonje.inventario;

public class ItemInventario {
    private final String id;
    private final String nombre;
    private final String tipo;
    private final int peso;
    private final int cantidad;

    public ItemInventario(String id, String nombre, String tipo, int peso, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.cantidad = cantidad;
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getPeso() { return peso * cantidad; }
    public int getCantidad() { return cantidad; }

    @Override
    public String toString() {
        return String.format("%s [%s] - Peso: %d - Cant: %d",
                nombre, tipo, peso, cantidad);
    }
}
