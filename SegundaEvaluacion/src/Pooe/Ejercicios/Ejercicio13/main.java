package Pooe.Ejercicios.Ejercicio13;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Libro Libro1 = new Libro("El color de la magia",1999, new String[]{"Terry Prachet"});
        System.out.println(Libro1.getTitulo() +" "+ Libro1.getAño_de_publicación() +" "+ Arrays.toString(Libro1.getAutores()));
    }
}
