package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author Fran
 * ParImpar
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.close();
        if (n % 2 == 0) {
            System.out.println("Es un número par");
        } else {
            System.out.println("Es un número impar");
        }
    }
}
