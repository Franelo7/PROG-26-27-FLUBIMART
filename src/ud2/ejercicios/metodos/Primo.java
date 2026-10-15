package ud2.ejercicios.metodos;

import java.util.Scanner;
/**
 * @author Fran
 * Primo
 */

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(esPrimo(n));
    }

    static boolean esPrimo(int n) {
        if (n == 0 || n % n == 0 && n % 2 != 0) {
            return true;
        }

        return false;
    }
}
