package Pooe;

import java.util.Scanner;

import java.util.Arrays;

public class cd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(a));
        int indice = sc.nextInt();
        long l = a[indice];
        System.out.println(l);
        int valor = sc.nextInt();
        a[indice] = a[indice] + valor;
        System.out.println(Arrays.toString(a));
    }
}
