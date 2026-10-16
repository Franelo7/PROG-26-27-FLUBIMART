package ud2.ejercicios.bucles;

import java.util.Scanner;
/**
 * @author Fran
 * Factorial
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int n = sc.nextInt();
        
        sc.close();
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        System.out.println(n);
    }
}
