package Arrays;

public class ej1 {
    public static void main(String[] args) {
        char[] caracteres = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };
        int cont = 0;
        for (char elementos: caracteres) {
            if (elementos =='a'){
                cont++;
            }
        }
        System.out.println(cont);
    }
}
