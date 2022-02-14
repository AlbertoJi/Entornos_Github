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

    public String getDNI() {
        return DNI;
    }

    public String getFechanombra() {
        return fechanombra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFechanombra(String fechanombra) {
        this.fechanombra = fechanombra;
    }
    public void Jasignado() {
        System.out.println("Jefe de estación: " + this.nombre + " DNI: " + this.DNI + " nombramiento: " + this.fechanombra);

    }
}