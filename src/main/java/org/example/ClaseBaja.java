package org.example;

public class ClaseBaja extends Sayayin {
    public ClaseBaja() {
    }

    public ClaseBaja(String nombre, Integer poderPelea, Integer edad, String colorPelo) {
        super(nombre, poderPelea, edad, colorPelo);
    }

    @Override
    public void pelear() {
        System.out.println(this.getNombre()+"Pelea con el corazón");
    }
}
