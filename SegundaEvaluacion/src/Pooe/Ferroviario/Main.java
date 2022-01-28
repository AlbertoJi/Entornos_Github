package Pooe.Ferroviario;

import Pooe.Ferroviario.Maquinaria.Vagones;
import Pooe.Ferroviario.Personal.Maquinistas;
import Pooe.Ferroviario.Personal.JefeDeEstación;
import Pooe.Ferroviario.Personal.Mécanico;


public class Main {
    public static void main(String[] args) {
        Maquinistas u1 = new Maquinistas("Pepe", "12345678W",2000,"Carmarada");
        JefeDeEstación c1 = new JefeDeEstación("Predro","5248723c" , "12/12/12");
        Mécanico g = new Mécanico("Mandamucho","640318568","Hidráulica");


        System.out.println("Mi estación tiene:");
        System.out.println(Maquinistas.Maqui + " unidades " + u1.getNombre() + " " + u1.getDNI() + " " + u1.getSueldo() +" "+ u1.getRango());
        System.out.println(JefeDeEstación.Jefe + " unidades " + c1.getNombre() + " " + c1.getDNI() + " " + c1.getFechanombra());
        System.out.println(Mécanico.mécanico + " unidades " + g.getNombre() + " " + g.getTeléfono() + " " + g.getEspecialidad());
        System.out.println(Vagones.vagones + " medicos ");

    }
}
