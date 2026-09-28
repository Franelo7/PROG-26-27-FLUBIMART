package ud1;

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
        double positivo = (-b + raiz) / 2 * a;
        double negativo = (-b - raiz) / 2 * a;
        String res1 = "El resultado del positivo es: " + positivo + "El resultado del positivo es: " + negativo;
        String res2 = "No tiene resultado";
      

        System.out.println(positivo + " " + negativo);

    }
}