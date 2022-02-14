package Pooe.Ferroviario.Maquinaria;



public class Vagones {
    private int indetificación;
    private Double carga_maxima;
    private int carga_actual; // Nos dijiste 0 lo dejamos en int
    Tipo_carga tipo_carga;
    public static int vagones;

    public Vagones(int indetificación, Double carga_maxima, int carga_actual, Tipo_carga tipo_carga) {
        this.indetificación = indetificación;
        this.carga_maxima = carga_maxima;
        this.carga_actual = 0;
        this.tipo_carga = tipo_carga;
        vagones++;
    }



    public int getIndetificación() {
        return indetificación;
    }

    public Double getCarga_maxima() {
        return carga_maxima;
    }

    public int getCarga_actual() {
        return carga_actual;
    }

    public Tipo_carga getTipo_carga() {
        return tipo_carga;
    }

    public void setIndetificación(int indetificación) {
        this.indetificación = indetificación;
    }

    public void setCarga_maxima(Double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public void setCarga_actual(int carga_actual) {
        this.carga_actual = carga_actual;
    }

    public void setTipo_carga(Tipo_carga tipo_carga) {
        this.tipo_carga = tipo_carga;
    }

//    public String Vasignado() {
//        System.out.println("ID: " + this.indetificación + " carga_maxima: " + this.carga_maxima + " carga_actual: " + this.carga_actual + " Tipo: " + this.tipo_carga);
//        return null;
//    }
    public void Vasignado(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Vagones{" +
                "indetificación=" + indetificación +
                ", carga_maxima=" + carga_maxima +
                ", carga_actual=" + carga_actual +
                ", tipo_carga=" + tipo_carga +
                '}';
    }
}

