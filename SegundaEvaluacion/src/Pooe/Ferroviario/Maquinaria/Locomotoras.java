package Pooe.Ferroviario.Maquinaria;

public class Locomotoras {
    private String matricula;
    private String motores;
    private String año;
    private String Mécanico;
    public static int locomotoras;

    public Locomotoras(String matricula, String motores, String año) {
        this.matricula = matricula;
        this.motores = motores;
        this.año = año;
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

    public void setMecanico(String Mécanico) {
        this.Mécanico = Mécanico;
    }
    public void setMecanico(Pooe.Ferroviario.Personal.Mécanico g3) {
    }

    public void Locoasignado() {
        System.out.println("Matricula: " + this.matricula +" potencia: "+ this.motores + " Año de Fabricación: " + this.año + " Mecanico: " + this.Mécanico);




    }



}
