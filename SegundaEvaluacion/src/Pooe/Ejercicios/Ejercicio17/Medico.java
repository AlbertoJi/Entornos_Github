package Pooe.Ejercicios.Ejercicio17;

public class Medico {
    private String nombre;
    static int medicos;

    public Medico(String nombre) {
        this.nombre = nombre;
        medicos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}