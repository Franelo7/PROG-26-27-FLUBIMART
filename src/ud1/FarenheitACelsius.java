package ud1;

import java.util.Scanner;

public class FarenheitACelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una temperatura en grados Farenheit: ");
        double grados = sc.nextDouble();
        sc.close();
        double celsius = (grados - 32) * 5 / 9;
        System.out.println("Hay un total de: " + celsius + " grados Celsius");
    }
}
