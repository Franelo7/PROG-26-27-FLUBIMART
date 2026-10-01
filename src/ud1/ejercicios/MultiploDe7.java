package ud1.ejercicios;

import java.util.Scanner;

public class MultiploDe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.close();
        int cantidad = (7 - (n % 7)) % 7;

        System.out.println("Hay que sumarle: " + cantidad);
    }
}
