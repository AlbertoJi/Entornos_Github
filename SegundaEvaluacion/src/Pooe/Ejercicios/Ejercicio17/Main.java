package Pooe.Ejercicios.Ejercicio17;

public class Main {
    public static void main(String[] args) {
        Unidad u1 = new Unidad("1");
        Unidad u2 = new Unidad("1");
        Unidad u3 = new Unidad("1");
        Unidad u4 = new Unidad("1");
        Unidad u5 = new Unidad("1");

        Caballero c1 = new Caballero("Predro");
        Caballero c2 = new Caballero("Moster");
        Caballero c3 = new Caballero("Pegaso");

        General g = new General("Mandamucho");

        Medico m = new Medico("Hause");

        System.out.println("mi ejercito tiene:");
        System.out.println(Unidad.unidades + " unidades");
        System.out.println(Caballero.caballeros + " caballeros");
        System.out.println(General.generales + " generales");
        System.out.println(Medico.medicos + " medicos");

    }
}
