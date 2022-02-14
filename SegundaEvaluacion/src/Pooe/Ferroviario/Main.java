package Pooe.Ferroviario;

import Pooe.Ferroviario.Maquinaria.Locomotoras;
import Pooe.Ferroviario.Maquinaria.Trenes;
import Pooe.Ferroviario.Personal.JefeDeEstación;
import Pooe.Ferroviario.Personal.Maquinistas;
import Pooe.Ferroviario.Personal.Mécanico;
import Pooe.Ferroviario.Personal.especialidad;


public class Main {
    public static void main(String[] args) {
        //Datos empleados
        Maquinistas u1 = new Maquinistas("Pepe", "12345678W",2000,"Carmarada");
        Maquinistas u2 = new Maquinistas("Maria", "45126783K",2000,"Carmarada");
        JefeDeEstación j1 = new JefeDeEstación("Mandamucho","5248723c" , "12/12/12");
        Mécanico g = new Mécanico("Rossel","604318568", especialidad.Hidráulica);
        Mécanico g1 = new Mécanico("Gorko","643108856", especialidad.Electricidad);
        Mécanico g2 = new Mécanico("Morko","656840318", especialidad.Motor);
        Mécanico g3 = new Mécanico("Daka","685412348", especialidad.Frenador);
        //Datos maquinaria
        Locomotoras lo = new Locomotoras("132abc","350","2020 ",g3);



        //MI estación
        System.out.println("Mi estación tiene:");
        u1.Maquiasignado();
        u2.Maquiasignado();
        j1.Jasignado();
        g.Masignado();
        g1.Masignado();
        g2.Masignado();
        g3.Masignado();
        System.out.println("Datos de locomotoras\n" +
                "==========================================");
        lo.mostrar();
        System.out.println("Datos del tren");
        Trenes tren = new Trenes(lo);
        tren.mostrar();

        System.out.println("Añadimos 6 vagones al tren.");
        tren.anadirVagon();
        tren.anadirVagon();
        tren.anadirVagon();
        tren.anadirVagon();
        tren.anadirVagon();
        // Intentamos meterlo, pero él no entra en array porque le hemos puesto un tamaño específico
        tren.anadirVagon();


        System.out.println("Asignamos uno de los maquinistas al tren creado");
        tren.setMaquinistas(u2);
        System.out.println("Maquinista asignado:");
        tren.getMaquinistas().Maquiasignado();

        System.out.println("Mostramos el número de vagones del tren");
        System.out.println("Vagones del tren: "+tren.getLista());

        System.out.println("Eseñamos el tren");
        tren.mostrar();

        System.out.println("Sacamos un vagón");
        tren.eliminarVagon();
        System.out.println("Eseñamos el tren Sin el vagon que sobra");
        tren.mostrar();

        System.out.println("Vagones que quedan");
        System.out.println("Vagones del tren: "+tren.getLista());
        System.out.println("Mi estación se compone de");
        //Restamos el número de vagones que son 5 y como hemos creado 6 nos dirá cuantos trenes tenemos
        System.out.println("Hay: "+(Trenes.totalTren -5) + " tren");
        System.out.println("Hay: "+(Trenes.totalTren -2) + " Vagones");
        System.out.println("Hay: "+Locomotoras.locomotoras + " Locomotora");
        System.out.println("Hay: "+JefeDeEstación.Jefe +" jefe");
        System.out.println("Hay: "+Maquinistas.Maqui+" maquinistas");
        System.out.println("Hay: "+Mécanico.mécanico + " mécanicos");




    }


}

