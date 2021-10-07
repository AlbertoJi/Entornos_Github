package variablesDatosOperadores;

import java.util.Scanner;

public class Ej18var {
//    Hacer un programa que lea una temperatura en grados centígrados, y la calcule y
//    visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:
//    Reamur = Centígrados x 0.8
//    Fahenheit = (Centígrados * 9/5)+32
//    Kelvin = Centígrados + 273
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Temperatura en C:");
        double centi = sc.nextDouble();
        double Reamur = centi * 0.8;
        double Fahen = (centi * 9/5) + 32;
        double kel = centi +273;
        System.out.println("Reamur = " + Reamur);
        System.out.println("Fahenheit = " + Fahen);
        System.out.println("Kelvin = " + kel);

    }
}
