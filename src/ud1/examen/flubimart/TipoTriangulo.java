package ud1.examen.flubimart;

import java.util.Scanner;

/**
 * @author Francisco José Lubián Martínez
 *         TipoTriangulo
 */
public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Introduce el lado 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Introduce el lado 3: ");
        double l3 = sc.nextDouble();
        sc.close();
        String resultado = "";
        String equilatero = l1 == l2 && l2 == l3 ? resultado += "Equilatero" : "";
        String isosceles = l1 == l2 && l1 != l3 || l1 == l3 && l1 != l2 ? resultado += "Isósceles" : "";
        String escaleno = l1 != l2 && l1 != l3 && l2 != l3 ? resultado += "Escaleno" : "";

        System.out.println("El triángulo es: " + resultado);

    }
}
