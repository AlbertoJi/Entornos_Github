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



}

