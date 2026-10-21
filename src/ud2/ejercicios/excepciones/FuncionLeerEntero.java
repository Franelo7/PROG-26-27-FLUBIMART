package ud2.ejercicios.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Fran
 *         LeerHastaCorrecto
 */

public class FuncionLeerEntero {
    public static void main(String[] args) {
        System.out.println(pedirNumero());
    }

    private static int pedirNumero() {

        Scanner sc = new Scanner(System.in);
        int n1;
        boolean v = true;
        while (v) {
            try {
                System.out.print("Introduce el número: ");
                n1 = sc.nextInt();
                v = false;
                return n1;
            } catch (InputMismatchException s) {
                System.out.println("No se admiten letras o caracteres inválidos");
                sc.next();
            }

        }
        sc.close();
        return 0;
    }
}
