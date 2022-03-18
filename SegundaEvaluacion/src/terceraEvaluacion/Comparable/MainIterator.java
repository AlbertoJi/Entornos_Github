package terceraEvaluacion.Comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {
    public static void main(String[] args) {
        Socio s1 = new Socio(75, "Alex", LocalDate.of(2040, 7, 7));
        Socio s2 = new Socio(22, "Gorka", LocalDate.of(2007, 7, 31));
        Socio s3 = new Socio(3, "Porka", LocalDate.of(2030, 7, 21));
        Socio s4 = new Socio(43, "Morko", LocalDate.of(2050, 7, 31));
        Socio s5 = new Socio(5, "Garrapatoz" + "(ezplosivo)", LocalDate.of(2009, 7, 11));
        ArrayList<Socio> socios = new ArrayList<Socio>();
        socios.add(s1);
        socios.add(s2);
        socios.add(s3);
        socios.add(s4);
        socios.add(s5);
       Iterator<Socio> it = socios.iterator();
       while (it.hasNext()){
        Socio s = it.next();
           System.out.println(s);
       }
    }
}
