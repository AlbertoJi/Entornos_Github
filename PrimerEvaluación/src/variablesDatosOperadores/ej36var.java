package variablesDatosOperadores;

public class ej36var {
    public static void main(String[] args) {
     byte b = 1;
     short s = 2;
     int i =3;
     long l = 4l;
     float f = 5f;
     double d = 6;
     char c = 7;
//     char es para caracteres
    boolean bool = true;
    s = b;// si
    i = b;
    l = b;
    f = b;
    d = b;
//    c = b; no
//    bool = b;  no

        b =(byte) s;// esto es casting explicito,
        // puedes hacer la conversión pero "forzando"
        i = s;
        l = s;
        f = s;
        d = s;
        c = (char) b;
//    bool = (boolean) b;  no
        long numeroGrande = 100_000_000_000_000L;
        int numero = (int) numeroGrande;
        System.out.println(numero);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        long varL = Long.MAX_VALUE;
        float varF = Float.MIN_VALUE;
    }

}
