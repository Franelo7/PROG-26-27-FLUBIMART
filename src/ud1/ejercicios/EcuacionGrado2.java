package ud1.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         EcuacionGrado2
 */

public class EcuacionGrado2 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Introduce el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Introduce el valor de c: ");
        c = sc.nextDouble();
        sc.close();

        double raiz = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        double positivo = (-b + raiz) / (2 * a);
        double negativo = (-b - raiz) / (2 * a);


        System.out.println(positivo + " " + negativo);
    }
}