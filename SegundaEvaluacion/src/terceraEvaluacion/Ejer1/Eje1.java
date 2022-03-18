package terceraEvaluacion.Ejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Implementar una aplicación que pida por consola números enteros no
//negativos hasta que se introduce -1.
// Los números se irán insertando en una
//colección, pudiéndose repetir.
// Al terminar, se mostrará la colección por pantalla.
//A continuación, se mostrarán todos los valores pares.
// Por último, se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
public class Eje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        List<Integer> lista = new ArrayList<>();
        System.out.println("dime números enteros no negativos");
        do {
            num = sc.nextInt();
            if (num >= 0) {
                lista.add(num);
            }

        }while (num != -1);
        System.out.println(lista);
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()){
            Integer s = it.next();
            if(s % 2 == 0) {
                System.out.println(s + " ");
            }
        }
        it = lista.iterator();
        while (it.hasNext()){
            Integer s = it.next();
            if(s % 3 == 0) {
                it.remove();
            }
        }
        System.out.println("Eliminamos los multiplos de 3");
        System.out.println(lista);

    }
}
