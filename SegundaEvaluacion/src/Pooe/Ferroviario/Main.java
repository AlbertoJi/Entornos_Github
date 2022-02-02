package Pooe.Ferroviario;

import java.util.ArrayList;
import Pooe.Ferroviario.Maquinaria.Locomotoras;
import Pooe.Ferroviario.Maquinaria.Vagones;
import Pooe.Ferroviario.Personal.Maquinistas;
import Pooe.Ferroviario.Personal.JefeDeEstación;
import Pooe.Ferroviario.Personal.Mécanico;

import static String.EjerciciosString.sc;


public class Main {
    public static void main(String[] args) {
        int opción;
        int cont = 0;
        //Datos empleados
        Maquinistas u1 = new Maquinistas("Pepe", "12345678W",2000,"Carmarada");
        Maquinistas u2 = new Maquinistas("Maria", "45126783K",2000,"Carmarada");
        JefeDeEstación c1 = new JefeDeEstación("Mandamucho","5248723c" , "12/12/12");
        Mécanico g = new Mécanico("Rossel","604318568","Hidráulica");
        Mécanico g1 = new Mécanico("Gorko","643108856","Electricidad");
        Mécanico g2 = new Mécanico("Morko","656840318","Motor");
        Mécanico g3 = new Mécanico("Daka","685412348","Frenador");
        //Datos maquinaria
        Locomotoras lo = new Locomotoras("132abc","350","2020");
        ArrayList<String> vagones = new ArrayList<>(4);






        System.out.println("Mi estación tiene:");
        System.out.println(Maquinistas.Maqui + " Maquinistas " + u1.getNombre() + ", Dni " + u1.getDNI() + ", Sueldo " + u1.getSueldo() +", rango "+ u1.getRango());
        System.out.println(Maquinistas.Maqui + " Maquinistas " + u2.getNombre() + ", Dni " + u2.getDNI() + ", Sueldo " + u2.getSueldo() +", rango "+ u2.getRango());
        System.out.println(JefeDeEstación.Jefe + " Jefe de estación " + c1.getNombre() + ", Dni " + c1.getDNI() + ", nombramiento  " + c1.getFechanombra());
        System.out.println(Mécanico.mécanico + " Mecánicos " + g.getNombre() + ", Teléfono " + g.getTeléfono() + ", se especializa " + g.getEspecialidad());
        System.out.println(Mécanico.mécanico + " Mecánicos " + g1.getNombre() + ", Teléfono " + g1.getTeléfono() + ", se especializa " + g1.getEspecialidad());
        System.out.println(Mécanico.mécanico + " Mecánicos " + g2.getNombre() + ", Teléfono " + g2.getTeléfono() + ", se especializa " + g2.getEspecialidad());
        System.out.println(Mécanico.mécanico + " Mecánicos " + g3.getNombre() + ", Teléfono " + g3.getTeléfono() + ", se especializa " + g3.getEspecialidad());


        System.out.println("Datos de locomotoras\n" +
                "==========================================");
        System.out.print(" Matricula " + lo.getMatricula() + ", motores " + lo.getMotores() + ", año " + lo.getAño() + " " );
        g3.Masignado();
        do {
            System.out.println("¿Cuál es la carga máxima?");
            String carga = sc.nextLine();
            System.out.println("¿Qué tipo de mercancía lleva?");
            System.out.println("1.Perecedera\n 2.No perecedera\n 3.Frágil\n 4.Peligrosa\n 5.Dimensional" );
            opción = sc.nextInt();
            switch (opción) {
                case 1:
                    System.out.println("Perecedera");
                    String tipo1 = "Perecedera" ;
                    break;
                case 2:
                    System.out.println("No perecedera");
                    break;
                case 3:
                    System.out.println("Frágil");
                    break;
                case 4:
                    System.out.println("Peligrosa");
                    break;
                case 5:
                    System.out.println("Dimensional");
                    break;
            }
          cont++;
        } while (cont != 5);

    }



    }

