package ud1.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         DistanciaEntreDosPuntos
 */

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de x1: ");
        x1 = sc.nextDouble();
        System.out.print("Introduce el valor de y1: ");
        y1 = sc.nextDouble();
        System.out.print("Introduce el valor de x2: ");
        x2 = sc.nextDouble();
        System.out.print("Introduce el valor de y2: ");
        y2 = sc.nextDouble();
        sc.close();
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("La distancia entre los dos puntos es de: " + d);
    }
}
