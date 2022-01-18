import java.util.Scanner;
/**
 * <h2>Estamsos creando una calculadora en java</h2>
 *
 * @version 13-12-2021
 * @author Alberto Jimenez Gudiño y Alfonso Fco Gismera Perea
 * @since v1
 */
public class MetodosConParametros {
    /**
     * Vamos a hacer una calculadora
     * Pedimos: dos numeros y una operacion
     * Hacemos la operacion correspondiente
     * Imprimimos el resultado
     * Recoger datos
     */
    /**
     * Numero uno.
     */
    private double a;
    /**
     * Numero dos.
     */
    private double b;
    /**
     * Llamo al metodo menu y devuelvo la operación seleccionada
     */
     private int operacion;


    /**
     * main
     * @param args escribir
     */
    public static void main(String[] args) {

        //Atributo
        /**
         * Aqui iniciamos el escaner y pedimos los numeros
         */
       Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        /**
         * Numero dos.
         */
        double b = sc.nextDouble();
        /**
         * Llamo al método menu y devuelvo la operacion seleccionada
         */
        int operacion = menu();
        seleccionarOperacion(operacion, a, b);

    }

    /**
     * Suma
     * @param a numero 1
     * @param b numero 2
     */
    public static void suma(double a, double b){
        double suma = a + b;
        System.out.println("Suma: " + suma);
    }

    /**
     * Resta
     * @param num1 numero 1
     * @param num2 numero 2
     */
    public static void resta(double num1, double num2) {
        double resta = num1 - num2;
        System.out.println("Resta" + resta);
    }

    /**
     * producto
     * @param num1 numero 1
     * @param num2 numero 2
     */
    public static void producto(double num1, double num2) {
        double producto = num1 * num2;
        System.out.println("Producto: " + producto);
    }

    /**
     * Cociente
     * @param num1 numero 1
     * @param num2 numero 2
     */
    public static void cociente(double num1, double num2) {
        double cociente = num1 / num2;
        System.out.println("Cociente: " + cociente);
    }


    /**
     * Menu
     * @return regreso para volver al menu
     */
    public static int menu() { // presenta el menú de opciones, y devuelve el código de operación
        Scanner sc = new Scanner(System.in);
        System.out.println("Operación: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
        int op = sc.nextInt();
        return op;
    }

    /**
     * Selecion de operpacion
     * @param op operacion
     * @param a numero 1
     * @param b numero 2
     */
    public static void seleccionarOperacion(int op, double a, double b) {
        if (op == 1) {
            // Suma
            suma(a, b);
        } else if (op == 2) {
            // Resta
            resta(a, b);
        } else if (op == 3) {
            // Multiplicación
            producto(a, b);
        } else if (op == 4) {
            // Cociente
            cociente(a, b);
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}
