package Pooe.Ferroviario.Maquinaria;

public class Vagones {
    private int indetificación;
    private int carga_maxima;
    private int carga_actual;
    private String tipo_carga;
    public static int vagones;

    public Vagones(int indetificación, int carga_maxima, int carga_actual, String tipo_carga) {
        this.indetificación = indetificación;
        this.carga_maxima = carga_maxima;
        this.carga_actual = carga_actual;
        this.tipo_carga = tipo_carga;
        vagones++;
    }

    public int getIndetificación() {
        return indetificación;
    }

    public int getCarga_maxima() {
        return carga_maxima;
    }

    public int getCarga_actual() {
        return carga_actual;
    }

    public String getTipo_carga() {
        return tipo_carga;
    }
}

