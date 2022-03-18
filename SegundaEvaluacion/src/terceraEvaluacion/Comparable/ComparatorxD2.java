package terceraEvaluacion.Comparable;

import java.util.Comparator;

public class ComparatorxD2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1 ;
        Socio s2 = (Socio) o2 ;
        if (s1.fechaNacimiento.compareTo(s2.fechaNacimiento) < 0){
            return -1;
        } else if (s1.fechaNacimiento.compareTo(s2.fechaNacimiento) > 0){
            return 1;
        } else{
            return 0;
        }


    }
}
