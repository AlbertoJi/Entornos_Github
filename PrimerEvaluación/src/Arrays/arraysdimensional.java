package Arrays;

public class arraysdimensional {
    public static void main(String[] args) {
        int [][] Tabla = {{0,1,2,3}, {4,5,6,7},{8,9,10,11}};// tabla es un array de 3 aarrays

        int [][] Tablairrgular = {{1,1,2,3,4,5,6,7,8,8},{2,1,2,3,4,5,6,7,8,7}
                ,{3,1,2,3,4,5,6,7,8,6},{4,1,2,3,4,5,6,7,8,5},
                {5,1,2,3,4,5,6,7,8,4},{6,1,2,3,4,5,6,7,8,3},
                {7,1,2,3,4,5,6,7,8,2},{8,1,2,3,4,5,6,7,8,1}};//
        System.out.println(Tabla.length);
        System.out.println(Tablairrgular.length);
        System.out.println(Tablairrgular[0].length);
        System.out.println(Tablairrgular[1].length);
        System.out.println(Tablairrgular[2].length);
        System.out.println(Tablairrgular[1][2]);
        System.out.println("-----------------");
        System.out.println("    a   b   c   d   e   f   g   h");
for (int i = 0; i < Tablairrgular.length; i++){
    for (int j = 0; j <Tablairrgular[i].length; j++){
        System.out.print(Tablairrgular[i][j] + "\t");
    }
    System.out.println();
}
        System.out.println("    a   b   c   d   e   f   g   h");
    }


}
