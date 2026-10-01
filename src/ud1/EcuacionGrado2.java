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
<<<<<<< HEAD
        double positivo = (-b + raiz) / 2 * a;
        double negativo = (-b - raiz) / 2 * a;
    
      
=======
        double positivo = (-b + raiz) / (2 * a);
        double negativo = (-b - raiz) / (2 * a);
>>>>>>> bf68f840b0d88fc71571db2f91efd25767bd2920

        System.out.println(positivo + " " + negativo);
    }
}