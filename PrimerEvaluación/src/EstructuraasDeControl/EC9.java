package EstructuraasDeControl;

import java.util.Scanner;

//Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se
//comparan con dos valores guardados previamente. Si coinciden, se indica “Has
//entrado al sistema”, en caso contrario se da un error.
public class EC9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un usuario");
        String usuario = sc.next();
        System.out.println("dame una contraseña.");
        String contraseña = sc.next();
        String usuarioC ="user";
        String ContraseñaC ="1234";
        if (usuario.equals(usuarioC) && contraseña.equals(ContraseñaC))  {
            System.out.println("Has entrado");
        } else {
            System.out.println("No has entrado");
        }

    }
}
