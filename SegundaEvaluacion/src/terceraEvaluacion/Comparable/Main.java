package terceraEvaluacion.Comparable;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Socio s1 = new Socio(75, "Alex", LocalDate.of(2000, 7, 31));
    Socio s2 = new Socio(22, "Gorka", LocalDate.of(2000, 7, 31));
    Socio s3 = new Socio(3, "Morka", LocalDate.of(2000, 7, 31));
    Socio s4 = new Socio(43, "Morko", LocalDate.of(2000, 7, 31));
    Socio s5 = new Socio(5, "Garrapatoz", LocalDate.of(2000, 7, 11));
        Socio[] socios = {s1,s2,s3,s4,s5};
        System.out.println("ARRAIZATE come tus arrayz con dannet");
        Arrays.sort(socios);
       for (Socio elemento: socios){
           System.out.println(elemento);
       }

    }

}
