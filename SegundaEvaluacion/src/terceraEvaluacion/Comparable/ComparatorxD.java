package terceraEvaluacion.Comparable;

import java.util.Comparator;

public class ComparatorxD implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1 ;
        Socio s2 = (Socio) o2 ;
        if (s1.nombre.compareToIgnoreCase(s2.nombre) < 0){
            return -1;
        } else if (s1.nombre.compareTo(s2.nombre) > 0){
            return 1;
        } else{
            return 0;
        }


    }
}
