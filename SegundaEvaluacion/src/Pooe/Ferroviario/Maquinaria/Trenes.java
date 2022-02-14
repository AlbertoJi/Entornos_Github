package Pooe.Ferroviario.Maquinaria;

import Pooe.Ferroviario.Personal.Maquinistas;

import java.util.ArrayList;
import java.util.Scanner;

public class Trenes {
    private Pooe.Ferroviario.Maquinaria.Locomotoras locomotoras;
    private ArrayList<Pooe.Ferroviario.Maquinaria.Vagones> lista;
    private Maquinistas maquinistas;
    Tipo_carga Tipo_carga;
    public static int totalTren;
    public static Scanner sc = new Scanner(System.in);

    public Pooe.Ferroviario.Maquinaria.Locomotoras getLocomotoras() {
        return locomotoras;
    }

    public void setLocomotoras(Pooe.Ferroviario.Maquinaria.Locomotoras locomotoras) {
        this.locomotoras = locomotoras;
    }

    public int getLista() {
        return (lista!=null?lista.size():0);
    }

    public void setLista(ArrayList<Pooe.Ferroviario.Maquinaria.Vagones> lista) {
        this.lista = lista;
    }

    public Maquinistas getMaquinistas() {
        return maquinistas;
    }

    public void setMaquinistas(Maquinistas maquinistas) {
        this.maquinistas = maquinistas;
    }

    public void mostrar(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\nTrenes{" +
                "\nlocomotoras=\n" + locomotoras +
                "\n, vagon=" + lista +
                "\n, maquinistas=" + maquinistas +
                '}' + "\n";
    }

    public Trenes(Locomotoras locomotora) {
        this.locomotoras = locomotora;
        totalTren++;
    }
    public void anadirVagon(){
        if (getLista()<5){
            if (lista ==null){
                lista = new ArrayList<Pooe.Ferroviario.Maquinaria.Vagones>();
            }
            lista.add(crearVagon());
        }else {
            System.out.println("No se puede añadir más");
        }
    }


    Pooe.Ferroviario.Maquinaria.Vagones crearVagon(){
        int id= totalTren++ + 1;//Nos dio problemas y lo dejemas en 1
        Double cargaMaxima=cargaMaxima();
        int cargaActual=0;
        Tipo_carga = elegirMercancia();

        return new Vagones(id,cargaMaxima,cargaActual,Tipo_carga);
    }
    private Double cargaMaxima() {
        System.out.println("Escribe la carga máxima del vagón: ");
        Double cargamax = sc.nextDouble();
        sc.nextLine();
        return cargamax;
    }
    private Tipo_carga elegirMercancia() {
        do {
            System.out.println("¿Qué tipo de mercancía lleva?");
            System.out.println("1.Perecedera\n 2.No perecedera\n 3.Frágil\n 4.Peligrosa\n 5.Dimensional");
            int opcion =sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    return Tipo_carga.Perecedera;

                case 2:
                    return Tipo_carga.No_perecedera;

                case 3:
                    return Tipo_carga.Frágil;

                case 4:
                    return Tipo_carga.Peligrosa;

                case 5:
                    return Tipo_carga.Dimensional;

                default:
                    System.out.println("Selecciona una opción correcta");
            }
        }while (true);
    }

    public void eliminarVagon() {
        lista.remove(lista.get(lista.size() - 1));
    }
}

