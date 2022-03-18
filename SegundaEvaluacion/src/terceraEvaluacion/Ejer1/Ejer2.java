package terceraEvaluacion.Ejer1;

import java.util.ArrayList;
//Implementar una aplicación en la que se insertan 20 números enteros aleatorios
//entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección. A
//continuación, se crea una lista con los mismos elementos sin repeticiones.

public class Ejer2 {
    public static void main(String[] args) {
//      int numero = (int)(Math.random()*10+1);
        int numero;
        ArrayList numeros = new ArrayList();
        ArrayList estrellas = new ArrayList();

// Genera 20 numeros entre 1 y 10
        for (int i = 1; i <= 20; i++) {
            numero = (int) (Math.random() * 10 + 1);
            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
            }
        }
    }
}
