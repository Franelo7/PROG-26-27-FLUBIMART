package ud2.ejercicios;

import java.util.Scanner;

public class MayorOIguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = sc.nextInt();
        sc.close();
        if (n1 == n2) {
            System.out.println(n1 + " es igual a " + n2);
        } else if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
        }
    }
}
