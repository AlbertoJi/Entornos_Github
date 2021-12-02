package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
//        muestre en el mismo orden introducido.
public class ar1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double[] a = new double[5];
        System.out.println(Arrays.toString(a));
for (int i = 0; i < a.length; i++) {
    System.out.println("Número");
    a[i] = sc.nextDouble();
}
        for (double v : a) {
            System.out.print(v + "\t");
        }
//        Forma original
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + "\t");
//        }
    }

    public static class ar9 {
        public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
        a[i] = (int) (Math.random() * 10 + 1);
        }
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));

        }
    }
}
