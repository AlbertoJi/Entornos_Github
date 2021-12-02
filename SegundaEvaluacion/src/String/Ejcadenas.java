package String;

import java.util.Locale;

public class Ejcadenas {
    public static void main(String[] args) {
     String cadena = "Hola\n ¿Que tal?";
     String cadena1 = "para alberto \"Pruebas\"";
     String vacia = ""; // no confundir con " " ni con null
        System.out.println(cadena);
        System.out.println(cadena1);
        int longitud = cadena.length();
        System.out.println(longitud);
        System.out.println(cadena.length());
        System.out.println( cadena.charAt(cadena.length()-1));
        System.out.println( cadena.charAt(0));
//      Esto no se puede hacer con string


//      Metodos
        System.out.println("******* METODOS *********");
        System.out.println("¿Cadena vacia? " + cadena.isEmpty());
        System.out.println("¿Cadena vacia? " + vacia.isEmpty());
        String blanco = " ";
        System.out.println("¿La cadea es un espacio en blanco ?" + blanco.isBlank());
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.startsWith("H"));
        System.out.println(cadena.endsWith("?"));
        System.out.println(cadena.contains("Hola"));
        System.out.println(cadena.substring(1,3));
        System.out.println(cadena.replace("a","i"));
        String espacio = "    aaaaa   ";
        System.out.println(espacio.length());
        espacio = espacio.trim();
        System.out.println(espacio.length());
        char a='a';
    }
}
