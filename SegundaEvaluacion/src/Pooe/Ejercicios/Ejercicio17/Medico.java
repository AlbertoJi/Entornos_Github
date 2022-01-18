package Pooe.Ejercicios.Ejercicio17;

public class Caballero {
    private String nombre;
    static int unidades;

    public Caballero(String nombre) {
        this.nombre = nombre;
        unidades++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}