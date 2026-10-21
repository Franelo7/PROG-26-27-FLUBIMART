package ud2.ejercicios.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerHastaCorrecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        boolean v = true;
        while (v) {
            try {
                System.out.print("Introduce el número: ");
                n1 = sc.nextDouble();
                System.out.println("El número es: " + n1);
                v = false;
            } catch (InputMismatchException s) {
                System.out.println("No se admiten letras o caracteres inválidos");
                sc.next();
            }

        }
        sc.close();
    }
}
