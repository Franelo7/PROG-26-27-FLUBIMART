package ud1.examen.flubimart;

import java.util.Scanner;

/**
 * @author Francisco José Lubián Martínez
 *         SalarioSemanal
 */
public class SalarioSemanal {
    public static void main(String[] args) {
        final double PRECIO_H_EXTRAS = 25;
        final double PRECIO_H = 12.50;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas: ");
        // Pongo el número de horas como double para poder contemplar la media hora.
        double h = sc.nextDouble();
        sc.close();

        double salario = h <= 40 ? h * PRECIO_H : (h - 40) * PRECIO_H_EXTRAS + 40 * PRECIO_H;
        System.out.printf("El salario es de: %.2f euros", salario);

    }
}
