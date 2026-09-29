package ud1;

import java.util.Scanner;

public class CalculoAreaTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el valor de c: ");
        double c = sc.nextDouble();
        sc.close();

        double areaTriangulo = (a - c) * b / 2;
        double areaRectangulo = b * c;
        double areaTotal = areaRectangulo + areaTriangulo;
        System.out.println("El área del terreno es de: " + areaTotal);

        double ladoInclinado = Math.sqrt(Math.pow(b, 2) + Math.pow(a - c, 2));
        double perimetro = a + b + c + ladoInclinado;

        System.out.println("El perimetro del terreno es: " + perimetro);
    }
}
