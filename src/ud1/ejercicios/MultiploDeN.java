package ud1.ejercicios;

import java.util.Scanner;

public class MultiploDeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        System.out.print("Introduce un número: ");
        int m = sc.nextInt();
        sc.close();
        int cantidad = (m - (n % m)) % m;

        System.out.println("Hay que sumarle: " + cantidad + "para que sea multiplo de: " + m);
    }
}
