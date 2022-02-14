package Pooe.Ferroviario.Personal;

public class Mécanico {
    private String nombre;
    private String teléfono;
    especialidad especialidad;
    public static int mécanico;

    public Mécanico(String nombre, String teléfono, especialidad especialidad) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.especialidad = especialidad;
        mécanico++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public Pooe.Ferroviario.Personal.especialidad getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public void setEspecialidad(especialidad especialidad) {
        this.especialidad = especialidad;
    }


    //Llamada para locomotora
    public void Masignado() {
        System.out.println("Mecánico: " + this.nombre + " Teléfono: " + this.teléfono + " especializa: " + this.especialidad);

    }

    @Override
    public String toString() {
        return "Mécanico{" +
                "nombre='" + nombre + '\'' +
                ", teléfono='" + teléfono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}