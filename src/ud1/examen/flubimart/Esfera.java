package ud1.examen.flubimart;

import java.util.Scanner;

/**
 * @ Francisco José Lubián Martínez
 * Esfera
 */
public class Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio de la esfera: ");
        double r = sc.nextDouble();
        sc.close();

        double a = 4 * Math.PI * Math.pow(r, 2);
        double v = Math.PI * Math.pow(r, 3) * 4 / 3;

        System.out.println("=======================");
        System.out.printf("Área: %.2f %nVolume: %.2f", a, v);

    }
}
