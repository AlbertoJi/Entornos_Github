/**
 * <h2>Ejercicio de JavaDoc para examen</h2>.
 * @author Alberto Jiménez Gudiño
 */
public class Paciente {
    String nombre;
    int edad;
    String[] síntomas;

    /**
     * Valores para la clase
     */
    public Paciente(){
        this.nombre = "Desconocido";
        this.edad = 999;
        this.síntomas = new String[]{"Ninguno"};
    }

    /**
     * Constructor para la clase
     * @param nombre Atributo para el String
     * @param edad Atributo para el int
     * @param síntomas Atributo para el String array
     */
    public Paciente(String nombre, int edad, String[] síntomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.síntomas = síntomas;
    }


    /**
     * @return El get para llamar el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El set para cambiar el nombre cuando se precise
     */
    public void setNombre(String nombre) {
        if (!nombre.equals(null)){
            this.nombre = nombre;
        }
    }

    /**
     * @return El get para llamar la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad El set para cambiar la edad cuando se precise
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return El get para llamar los síntomas
     */
    public String[] getSíntomas() {
        return síntomas;
    }

    /**
     * @param síntomas El set para cambiar los síntomas cuando se precise
     */
    public void setSíntomas(String[] síntomas) {
        this.síntomas = síntomas;
    }
}
