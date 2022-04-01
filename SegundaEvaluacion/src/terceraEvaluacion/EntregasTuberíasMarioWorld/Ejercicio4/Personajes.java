package terceraEvaluacion.EntregasTuberíasMarioWorld.Ejercicio4;

public class Personajes {
    private String nombre;
    private String dni;
    private String fechaNac;

    public Personajes(String nombre, String dni, String fechaNac) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }
}
