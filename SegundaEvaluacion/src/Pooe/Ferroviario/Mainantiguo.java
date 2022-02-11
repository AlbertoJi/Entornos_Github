package Pooe.Ferroviario;

import Pooe.Ferroviario.Maquinaria.Locomotoras;
import Pooe.Ferroviario.Personal.JefeDeEstación;
import Pooe.Ferroviario.Personal.Maquinistas;
import Pooe.Ferroviario.Personal.Mécanico;

import java.util.ArrayList;


public class Mainantiguo {
    public static void main(String[] args) {
        //Datos empleados
        Maquinistas u1 = new Maquinistas("Pepe", "12345678W",2000,"Carmarada");
        Maquinistas u2 = new Maquinistas("Maria", "45126783K",2000,"Carmarada");
        JefeDeEstación j1 = new JefeDeEstación("Mandamucho","5248723c" , "12/12/12");
        Mécanico g = new Mécanico("Rossel","604318568","Hidráulica");
        Mécanico g1 = new Mécanico("Gorko","643108856","Electricidad");
        Mécanico g2 = new Mécanico("Morko","656840318","Motor");
        Mécanico g3 = new Mécanico("Daka","685412348","Frenador");
        //Datos maquinaria
        Locomotoras lo = new Locomotoras("132abc","350","2020");


        ArrayList<String> tren = new ArrayList<>(4);






        System.out.println("Mi estación tiene:");
        u1.Maquiasignado();
        u2.Maquiasignado();
        System.out.println(Maquinistas.Maqui + " Maquinistas " + u2.getNombre() + ", Dni " + u2.getDNI() + ", Sueldo " + u2.getSueldo() +", rango "+ u2.getRango());
        j1.Jasignado();
        System.out.println(JefeDeEstación.Jefe + " Jefe de estación " + j1.getNombre() + ", Dni " + j1.getDNI() + ", nombramiento  " + j1.getFechanombra());
        g.Masignado();
        g1.Masignado();
        g2.Masignado();
        g3.Masignado();
        System.out.println(Mécanico.mécanico);



        System.out.println("Datos de locomotoras\n" +
                "==========================================");
        System.out.print(" Matricula " + lo.getMatricula() + ", motores " + lo.getMotores() + ", año " + lo.getAño() + " " );
        g3.Masignado();

//            Vagones va = new Vagones("1",carga,getcargaactual);
//            System.out.println(" Jefe de estación " + j1.getNombre() + ", Dni " + j1.getDNI() + ", nombramiento  " + j1.getFechanombra());


    }



}