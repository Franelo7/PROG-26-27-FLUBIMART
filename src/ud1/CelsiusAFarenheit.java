package ud1;

import java.util.Scanner;

public class CelsiusAFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una temperatura en grados Celsius: ");
        sc.close();
        double grados = sc.nextDouble();
        double farenheit = grados * 9 / 5 + 32;
        System.out.println("Hay un total de: " + farenheit + " grados Farenheit");
    }
}
