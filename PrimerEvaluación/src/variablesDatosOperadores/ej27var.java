package variablesDatosOperadores;

public class ej27var {
    public static void main(String[] args) {
        double n1 = 8;
        double n2 = 5;
        double n3 = 7;
        double n4 = (n1 + n2 + n3)/3;
        double r1 = (n4 * 55)/100;
        double nf = 7;
        double r2 = (nf * 30)/100;
        double tf = 6;
        double r3 = (tf * 15)/100;
        double cf =(r1 + r2 + r3);
        System.out.println("Estas som mis notas Parciales " + n1 + " " + n2 + " "+ n3);
        System.out.println("Mi nota del examen final " + nf);
        System.out.println("Mi nota del trabajo final " + tf);
        System.out.printf("Mi calificación final: %.1f ",+ cf);


    }
}
