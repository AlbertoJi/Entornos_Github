package Arrays;

import java.util.Arrays;

public class ar5 {
    public static void main(String[] args) {
     int contPos = 0, contNeg = 0, contceros = 0;
     double sumapos = 0, sumaNeg = 0;
     int[] a = new int[20];
     for (int i = 0; i < a.length; i++){
         a[i] = (int) (Math.random() * (10 - (-10) + 1) + (-10));
     }
        System.out.println(Arrays.toString(a));
     for (int i = 0; i < a.length; i++){
         if (a[i] > 0){
             sumapos = sumapos + a[i];
             contPos++;
             }else if (a[i] < 0){
           sumapos = sumaNeg + a[i];
           contNeg++;
         }else {
             contceros++;
         }
         System.out.println("Suma pos" + sumapos);
         System.out.println("Suma neg" + sumaNeg);
         }
     }
}
