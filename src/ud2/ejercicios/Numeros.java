package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         Numeros
 */
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println(n1 + " es igual a " + n2);
        } else {
            System.out.println(n1 + " no es igual a " + n2);
        }

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
            System.out.println(n1 + "," + n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
            System.out.println(n2 + "," + n1);
        }
        
        System.out.print("Introduce un tercer número: ");
        int n3 = sc.nextInt();
        sc.close();
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + "," + n2 + "," + n3);
        }
        if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n1 + "," + n3 + "," + n2);
        }
        if (n2 > n1 && n1 > n3 && n2 > n3) {
            System.out.println(n2 + "," + n1 + "," + n3);
        }
        if (n2 > n1 && n3 > n1 && n2 > n3) {
            System.out.println(n2 + "," + n3 + "," + n1);
        }
        if (n3 > n1 && n2 > n1 && n3 > n2) {
            System.out.println(n3 + "," + n2 + "," + n1);

        }
        if (n3 > n1 && n1 > n2 && n3 > n2) {
            System.out.println(n3 + "," + n1 + "," + n2);
        }

    }
}
