package terceraEvaluacion.Ejer1.Extras;

import java.util.*;
// Esta a medias faltaria meter las cosas en un map para coger los elementos repetidos
public class Ejercicio6 {
    public static void main(String[] args) {
//        Insertar en una lista 20 enteros aleatorios entre 1 y 10. A partir de ella, crear un
//        conjunto con los elementos de la lista sin repetir, otro con los repetidos y otro
//        con los elementos que aparecen una sola vez en la lista original.
// Creamos la lista
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaR = new ArrayList<>();
        int num = 0;

        for (int i = 0; i < 20; i++) {
             num = (int) (Math.random() * 10 + 1);
            lista.add(num);
        }
        // la mostramos
        System.out.print("Colección: ");
        for (Integer elemento: lista) {
            System.out.print(elemento + " ");
        }

        // se crea una lista con los elementos sin repeticiones
        Set<Integer> conjunto = new HashSet<>(lista);
        System.out.print("\nSin repetir: ");
        for (Integer integer : conjunto) {
            System.out.print(integer + " ");
        }
    }
    }

