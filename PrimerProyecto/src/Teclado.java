import java.util.Scanner;

public class Teclado {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("hola,¿como te llamas?");
        String nombre = teclado.nextLine();
        System.out.println("hola " + nombre);
    }

}
