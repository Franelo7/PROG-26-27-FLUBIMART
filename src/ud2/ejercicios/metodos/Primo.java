package ud2.ejercicios.metodos;

import java.util.Scanner;

/**
 * @author Fran
 *         Primo
 */

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(esPrimo(n));
    }

    public static boolean esPrimo(int n) {
        int contador = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        if (contador == 0 && n != 2) {
            return true;
        }

        return false;
    }
}
