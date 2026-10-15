package ud2.ejercicios.metodos;

import java.util.Scanner;
/**
 * @author Fran
 * Cilindro
 */

public class Cilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        double r = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        double h = sc.nextDouble();
        sc.close();
        areaVolumen(r, h);
    }

    public static void areaVolumen(double radio, double altura) {
        double area = 2 * Math.PI * radio * (altura + radio);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El área del cilindro es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
