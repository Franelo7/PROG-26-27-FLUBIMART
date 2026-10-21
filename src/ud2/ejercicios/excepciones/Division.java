package ud2.ejercicios.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Fran
 *         Division
 */
public class Division {
    public static void main(String[] args) {
        int n1, n2;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el numerador: ");
            n1 = sc.nextInt();
            System.out.print("Introduce el denominador: ");
            n2 = sc.nextInt();
            sc.close();
            System.out.println(n1 + " : " + n2 + " = " + n1 / n2);
        } catch (InputMismatchException s) {
            System.out.println("No se admiten números decimales");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }
    }
}
