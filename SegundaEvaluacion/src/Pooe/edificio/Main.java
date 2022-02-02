package Pooe.edificio;

public class Main {


    public static void main(String[] args) {
        Edificio edificio1 = new Edificio(4,2400,1966);
        Edificio edificio2 = new Edificio(5,3000,2001);
        Edificio edificio3 = new Edificio(1,1000,2018);

        System.out.println(edificio1.numplantas + " plantas: " + edificio1.area + " año: " + edificio1.año);
        System.out.println(edificio2.numplantas + " plantas: " + edificio2.area + " año: " + edificio2.año);
        System.out.println(edificio3.numplantas + " plantas: " + edificio3.area + " año: " + edificio3.año);

        edificio1.imprimeDatos();
        edificio2.imprimeDatos();
        edificio3.imprimeDatos();


0
    }
}
