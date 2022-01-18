package Pooe.edificio;

public class Edificio {
    int numplantas;
    double area;
    int año;

    public Edificio(int numplantas, double area, int año) {
        this.numplantas = numplantas;
        this.area = area;
        this.año = año;
    }

    public void imprimeDatos() {
        System.out.println("edi: " + this.numplantas + " plantas: " + this.area + " año: " + this.año);

    }

}