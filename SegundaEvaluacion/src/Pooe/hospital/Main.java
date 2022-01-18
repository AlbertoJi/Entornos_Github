package Pooe.hospital;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Norrmalmente los objetos los creamos en tiempo de ejecución

        //Voy a crear un objeto a oartir de la clase Paciente
        // La clase es como un tipo de dato
        // Tipo nombreObjeto = new metodoconctructor
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();
        Paciente paciente3 = new Paciente();
        // Ahora le  asignamos valores a los atributos
        // paciente1.nombre = "Pepe";
        // paciente2.nombre = "Ronalde";
        // paciente1.edad = 50;
        // paciente1.codigoSS = "12345678";
        // //Sintomas
        // paciente1.sintomas = new String[]{"Tos", "Fiebre " ,                    "Cansancio"};
        // System.out.println(paciente1.nombre);
        // System.out.println(paciente2.nombre);
        // Paciente 3
        // System.out.println(paciente3.nombre);
        // crear objeto Napoleón
        // paciente3.nombre = "Napoleón";
        // paciente3.edad = 300;
        // paciente3.codigoSS = "00000000";
        // System.out.println(paciente3.nombre);
        // System.out.println(paciente3.edad);
        // System.out.println(paciente3.codigoSS);

        //vamos a probar el constructro con parametros
        Paciente paciente0 = new Paciente("Lin",23, "22322456", new String[]{"Tos","Cansancio"});
        System.out.println("Datos:");
        System.out.println("======");
//        System.out.println("nombre: " + paciente0.nombre + ", edad "
//        + paciente0.edad + ", codigoss " + paciente0.codigoSS + ", sintomas ");
//        System.out.println(Arrays.toString(paciente0.sintomas));

        //si quiero mostrar el nombre del paciente:
        System.out.println(paciente0.getNombre());
        System.out.println(paciente0.getEdad());
        System.out.println(paciente0.getCodigoSS());
        System.out.println(Arrays.toString(paciente0.getSintomas()));

        //cambiamos el nombre del paciente0
        paciente0.setNombre("maria");
        // ahora ver como se llama
        System.out.println(paciente0.getNombre());
    }
}
