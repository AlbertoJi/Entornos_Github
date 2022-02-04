package Pooe.Ferroviario.Personal;

public class Maquinistas {

    private String nombre;
    private  String DNI;
    private  double sueldo;
    private String rango;
    public static int Maqui;

    public Maquinistas(String nombre, String DNI, double sueldo, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
        Maqui++;
    }

    public String getNombre() {
        return nombre;
    }



    public String getDNI() {
        return DNI;
    }



    public double getSueldo() {
        return sueldo;
    }



    public String getRango() {
        return rango;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    public void Maquiasignado() {
        System.out.println("Mecánico: " + this.nombre + " DNI: " + this.DNI + " sueldo: " + this.sueldo + " rango "+ this.rango);

    }
}

