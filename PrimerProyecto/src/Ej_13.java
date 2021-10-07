import java.util.Scanner;

public class Ej_13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿cual es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("edad:");
        int edad = sc.nextInt();
        System.out.println("Años de experiencia:");
        int experiencia = sc.nextInt();
        System.out.println();
        System.out.println("Preferencia de cocina:");
        String cocina = sc.nextLine();
        System.out.println("\"El formulario de " + nombre + " de" + edad + " años" + " y " + experiencia + "está completo" + "Nos comunicaremos" +
                "con usted si necesitamos a alguien que cocine" + cocina);
    }


}
