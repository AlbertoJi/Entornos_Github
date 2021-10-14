package EstructuraasDeControl;

import java.util.Scanner;

//Tenemos un programa que pregunta a los estudiantes qué lenguaje de
//programación están estudiando. Hay cuatro opciones, una de las cuales es correcta:
//a. Java
//b. Kotlin
//c. Scala
//d. Python
//Tu tarea consiste en leer el número de respuesta de la entrada estándar y generar
//el resultado de la prueba: " ¡Sí! ", " ¡No! " u "Opción desconocida". La respuesta
//correcta es Java (obviamente).
public class EC15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que leguaje estas estudiando?\n1. Java\n2. Kotlin\n3. Scala\n4. Python");
        int opción = sc.nextInt();
        if (opción == 1) {
            System.out.println("!Si¡");
        } else if (opción >= 2 && opción <= 4){
            System.out.println("!No¡");
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}
