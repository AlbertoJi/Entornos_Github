package Pooe.Ferroviario.Personal;

public class JefeDeEstación {
    private String nombre;
    private String DNI;
    private String fechanombra;
    public static int Jefe;

    public JefeDeEstación(String nombre, String DNI, String fechanombra) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechanombra = fechanombra;
        Jefe++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}