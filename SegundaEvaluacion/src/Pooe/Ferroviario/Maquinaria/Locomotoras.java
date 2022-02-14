package Pooe.Ferroviario.Maquinaria;

import Pooe.Ferroviario.Personal.Mécanico;

public class Locomotoras {
    private String matricula;
    private String motores;
    private String año;
    Mécanico mecanico;
    public static int locomotoras;

    public Locomotoras(String matricula, String motores, String año,Mécanico mecanico) {
        this.matricula = matricula;
        this.motores = motores;
        this.año = año;
        this.mecanico = mecanico;
        locomotoras++;
    }


    public String getMatricula() {
        return matricula;
    }

    public String getMotores() {
        return motores;
    }

    public String getAño() {
        return año;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMotores(String motores) {
        this.motores = motores;
    }

    public void setAño(String año) {
        this.año = año;
    }


    public void setMecanico(Mécanico mecanico) {
    }

    @Override
    public String toString() {
        return "Locomotoras{" +
                "matricula='" + matricula + '\'' +
                ", motores='" + motores + '\'' +
                ", año='" + año + '\'' +
                ", mecanico=" + mecanico +
                '}';
    }
    public void mostrar(){
        System.out.println(toString());
    }
    // Esto es una prueba del anterior modelo Ignorar
    public String Locoasignado() {
        System.out.println("Matricula: " + this.matricula +" potencia: "+ this.motores + " Año de Fabricación: " + this.año + this.mecanico);

        return null;
    }

}
