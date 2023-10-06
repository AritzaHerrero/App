package com.talde3.app;

public class Pertsona {
    protected String izena;

    // Constructor
    public Pertsona(String izena) {
        this.izena = izena;
    }

    public Pertsona() {
    }

    // Getters
    public String getIzena() {
        return izena;
    }

    // Setters
    public void setIzena(String izena) {
        this.izena = izena;
    }
}
