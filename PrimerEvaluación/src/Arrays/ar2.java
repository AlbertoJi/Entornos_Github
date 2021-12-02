package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
//muestre en el orden inverso al introducido.
public class ar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[5];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println("Número");
            a[i] = sc.nextDouble();
        }
        for (int i = (a.length -1); i >= 0; i--) {
            System.out.print(a[i] + "\t");
        }
    }
}
