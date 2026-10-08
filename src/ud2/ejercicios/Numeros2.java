package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 */
public class Numeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n > 0) {
            System.out.println("Introduce un número: ");
            n = sc.nextInt();
            if (n == 0) {
                n = 0;
            } else {
                if (n % 2 == 0) {
                    System.out.println("Es par");
                } else {
                    System.out.println("No es par");
                }
                if (n > 0) {
                    System.out.println("Es positivo");
                } else {
                    System.out.println("Es negativo");
                }
                System.out.println("Su cuadrado es: " + Math.pow(n, 2));
            }
        }
        sc.close();
    }
}
