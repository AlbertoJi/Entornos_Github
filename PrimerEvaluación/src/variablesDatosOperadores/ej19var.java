package variablesDatosOperadores;


import java.util.Scanner;

public class ej19var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x1:");
        double x1 = sc.nextDouble();
        System.out.println("y1:");
        double y1 = sc.nextDouble();
        System.out.println("x2:");
        double x2 = sc.nextDouble();
        System.out.println("y2");
        double y2 = sc.nextDouble();

        double d = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.printf("Distacia: %.2f", d);

    }
}
