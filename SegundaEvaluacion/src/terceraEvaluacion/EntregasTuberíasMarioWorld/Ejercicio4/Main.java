package terceraEvaluacion.EntregasTuberíasMarioWorld.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personajes> clientes = new ArrayList<>();
        clientes.add(new Personajes("Mario","11111111A","2004-12-15"));
        clientes.add(new Personajes("Peach","22222222B","2001-05-6"));
        clientes.add(new Personajes("Wario","33333333C","1988-09-7"));
        clientes.add(new Personajes("Yoshi","444444444D","2002-10-10"));
        clientes.add(new Personajes("Bowser","55555555F","1972-02-2"));
        System.out.println(clientes);
        System.out.println("Ordenados por fecha de nacímiento");
        clientes.stream()
                .sorted((c1,c2) -> c1.getFechaNac().compareTo(c2.getFechaNac()))
                .forEach(System.out::println);
//                forma original
//                .forEach(personajes -> System.out.println(personajes));

    }

}
