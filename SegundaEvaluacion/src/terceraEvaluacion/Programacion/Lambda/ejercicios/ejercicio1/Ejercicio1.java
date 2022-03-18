package terceraEvaluacion.Programacion.Lambda.ejercicios.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        DeterminarSigno ds = num -> Integer.compare(num,0);
        System.out.println(determinarSigno(5));
        System.out.println(determinarSigno(-15));
        System.out.println(determinarSigno(0));

    }

    private static int determinarSigno(int num) {
        if (num > 0){
            return 1;
        } else if (num < 0){
            return -1;
        } else{
            return 0;
        }
    }
    public static  String print(String arg) {
        return "\"" + arg + "\"";
    }

    public static int[] getPrimeroYÚltimo(int[] array){
        return new int[]{array[0], array[array.length-1]};
    }

}
