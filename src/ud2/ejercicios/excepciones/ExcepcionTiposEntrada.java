package ud2.ejercicios.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Fran
 *         ExcepcionTiposEntrada
 */
public class ExcepcionTiposEntrada {
    public static void main(String[] args) {
        double n1;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el número: ");
            n1 = sc.nextDouble();
            sc.close();
            System.out.println("El número es: " + n1);
        } catch (InputMismatchException s) {
            System.out.println("No se admiten letras o caracteres inválidos");
        }
    }
}
