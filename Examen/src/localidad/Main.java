/**
 * @author Alberto Jiménez Gudiño
 */
package localidad;

public class Main {
    public static void main(String[] args) {
        Localidad localidad = new Localidad();
        localidad.setLocalidad("Burgos");
        localidad.setHabitantes(12);
        System.out.println("Localidad: " + localidad.getLocalidad() +
                " Nº habitantes: " + localidad.getHabitantes());
    }
}
