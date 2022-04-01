package terceraEvaluacion.Programacion.EjerciciosStream.Ejercicio2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Gandalf",Integer.MAX_VALUE, Persona.Armas.Bastón,false));
        personas.add(new Persona("Aragorn",88, Persona.Armas.Espada,true));
        personas.add(new Persona("Gimli",140, Persona.Armas.Hacha,false));
        personas.add(new Persona("legolas",2931, Persona.Armas.Arco,false));
        personas.add(new Persona("Boromir",41, Persona.Armas.Espada,true));
        personas.add(new Persona("Frodo",51, Persona.Armas.Anillo,false));
        personas.add(new Persona("Sam",33, Persona.Armas.Espada,false));

        System.out.println("\"Jóvenes\" con espada:");
        personas.stream()
                .filter(persona -> persona.getEdad() <= 90 && persona.getArma().equals(Persona.Armas.Espada))
                .forEach(persona -> System.out.println(persona));

    }
}
