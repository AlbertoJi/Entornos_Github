package EstructuraasDeControl;

import java.util.Scanner;

public class EC6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mantequilla:");
        int x = sc.nextInt();
        System.out.println("Es fin de semana:");
        boolean y = sc.hasNextBoolean();
        boolean s =y && ((x >= 10) && (x <= 20)) || (y && ((x >= 15) && (x <= 25)));
        boolean fins = y && (x <= 15) && (x >= 25);

        boolean exito;
        if (s) {
            if (x >= 15 && x <= 25) {
                exito = true;
            } else {
                exito = false;
            }
        } else {
            if (x >= 15 && x <= 25) {
                exito = true;
            } else {
                exito = false;
            }


        }

    }
}
