package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         EdadMaximaMinima
 */
public class EdadMaximaMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad");
        int edad = sc.nextInt();
        int edadMaxima = 0;
        int edadMinima = 0;

        while (edad >= 0) {
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
            if (edadMinima == 0) {
                edadMinima = edad;
            } else if (edadMinima > edad) {
                edadMinima = edad;
            }
            System.out.println("Introduce la edad");
            edad = sc.nextInt();
        }
        sc.close();
        System.out.println("La edad máxima es: " + edadMaxima);
        System.out.println("La edad mínima es: " + edadMinima);
    }
}
