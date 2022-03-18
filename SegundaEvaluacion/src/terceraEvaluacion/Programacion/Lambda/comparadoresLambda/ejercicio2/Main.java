//package terceraEvaluacion.Programacion.Lambda.comparadoresLambda.ejercicio2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Paciente> Pacientes = new ArrayList<>();
//        Pacientes.add(new Paciente("Felipe R.", 54, new String[]{"Náuseas", "mareos"}));
//        Pacientes.add(new Paciente("Carmen C.", 15, 28));
//        Pacientes.add(new Paciente ("Irene M.", 32, 25));
//        Pacientes.add(new Paciente("Santiago A.", 8, 44));
//        Pacientes.add(new Paciente("Isabel A.", 60, 15));
//        imprimir(Pacientes);
//
//        System.out.println("\n Ordenadores por nombre: ");
//       // ComparadorNombre cNom = new ComparadorNombre();
//        Pacientes.sort((Paciente p1,Paciente p2) ->p1.getNombre().compareTo(p2.getNombre()));
//        imprimir(Pacientes);
//
//        System.out.println("\n Ordenadores por apellidos: ");
//        Pacientes.sort((Paciente p1,Paciente p2) ->p1.getApellido().compareTo(p2.getApellido()));
//        imprimir(Pacientes);
//
//        System.out.println("\n Ordenadores por edad: ");
//        Pacientes.sort((Paciente p1,Paciente p2) ->p1.getEdad() - p2.getEdad());
//        imprimir(Pacientes);
//
//    }
//
//    static void imprimir(List<Paciente> lista) {
//        for (Paciente elemento: lista) {
//            System.out.println(elemento);
//        }
//    }
//}