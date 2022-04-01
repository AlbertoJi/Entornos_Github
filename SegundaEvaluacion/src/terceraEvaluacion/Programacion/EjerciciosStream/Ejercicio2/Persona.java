package terceraEvaluacion.Programacion.EjerciciosStream.Ejercicio2;

public class Persona {
    private String nombre;
    private int edad;
    private Armas arma;
    private boolean humano;

    public enum Armas {
        Bastón,
        Espada,
        Hacha,
        Arco,
        Anillo
    }

    public Persona(String nombre, int edad, Armas arma, boolean humano) {
        this.nombre = nombre;
        this.edad = edad;
        this.arma = arma;
        this.humano = humano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    public boolean isHumano() {
        return humano;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", arma=" + arma +
                ", humano=" + humano +
                '}';
    }
}

