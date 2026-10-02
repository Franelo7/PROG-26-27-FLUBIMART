package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author Fran
 * Ordenar3Numeros
 */
public class Ordenar3Numeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Introduce un tercer número: ");
        int n3 = sc.nextInt();
        sc.close();
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + "," + n2 + "," + n3);
        } else if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n1 + "," + n3 + "," + n2);
        } else if (n2 > n1 && n1 > n3 && n2 > n3) {
            System.out.println(n2 + "," + n1 + "," + n3);
        } else if (n2 > n1 && n3 > n1 && n2 > n3) {
            System.out.println(n2 + "," + n3 + "," + n1);
        } else if (n3 > n1 && n2 > n1 && n3 > n2) {
            System.out.println(n3 + "," + n2 + "," + n1);

        } else {
            System.out.println(n3 + "," + n1 + "," + n2);
        }
    }
}
