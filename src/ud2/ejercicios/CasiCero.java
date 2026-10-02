package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         CasiCero
 */
public class CasiCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        double n = sc.nextDouble();
        sc.close();

        if (n == 0 || n <= -1 || n >= 1) {
            System.out.println("No es un número casi 0");
        } else {
            System.out.println("Es un número casi 0");
        }
    }
}
