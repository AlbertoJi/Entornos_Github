package Pooe.Ferroviario.Maquinaria;

public class Vagones {
    private String nombre;
    static int vagones;

    public Vagones(String nombre) {
        this.nombre = nombre;
        vagones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}