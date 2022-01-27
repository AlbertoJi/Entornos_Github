package Pooe.Ferroviario.Personal;

public class Mécanico {
    private String nombre;
    static int mécanico;

    public Mécanico(String nombre) {
        this.nombre = nombre;
        mécanico++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}