/**
 * @author Alberto Jiménez Gudiño
 */
package localidad;

import java.util.Scanner;

public class Localidad {
    final static String PREFIJOESPAÑA = "34";
    private int numhabitantes;
    private String localidad;

    public Localidad() {

    }

    public int getHabitantes() {
        return this.numhabitantes;
    }

    public void setHabitantes(int habitantes) {
        this.numhabitantes = numhabitantes;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }




    public Localidad(Scanner sc) {
        System.out.println("Localidad: ");
        this.localidad = sc.nextLine();

        System.out.println("Número de habitantes: ");
        this.numhabitantes = sc.nextInt();
        sc.nextLine();
    }
}
