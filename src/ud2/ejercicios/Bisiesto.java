package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 */

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de año: ");
        int n = sc.nextInt();
        sc.close();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
