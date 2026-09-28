package ud1;

import java.util.Scanner;

/**
 * @author Fran
 */
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, h, b;
        b = sc.nextDouble();
        h = sc.nextDouble();
        sc.close();
        a = b * h / 2;
        System.out.println("El área del triángulo es: " + a);
    }
}
