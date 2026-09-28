package ud1;

import java.util.Scanner;
/**
 * @author Fran
 */
public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es par: ");
        int n = sc.nextInt();
        sc.close();
        boolean esPar = n % 2 == 0 ? true : false;
        System.out.println(esPar);
    }
}
