package ud2.ejercicios.metodos;

import java.util.Scanner;

/**
 * @author Fran
 *         Calculadora
 */
public class Calculadora {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(menu());
    }

    static double menu() {
        System.out.println("Sumar (1)");
        System.out.println("Restar (2)");
        System.out.println("Dividir(3)");
        int n = sc.nextInt();
        if (n == 1) {
            return suma();
        } else if (n == 2) {
            return resta();
        } else if (n == 3) {
            return dividir();
        } else {
            System.out.println("Número fuera de rango vuelva a intentarlo");
            return menu();
        }

    }

    static double suma() {
        System.out.println("Introduce en número 1");
        double n1 = sc.nextDouble();
        System.out.println("Introduce el número 2");
        double n2 = sc.nextDouble();
        return n1 + n2;
    }

    static double resta() {
        System.out.println("Introduce en número 1");
        double n1 = sc.nextDouble();
        System.out.println("Introduce el número 2");
        double n2 = sc.nextDouble();
        return n1 + n2;
    }

    static double dividir() {
        System.out.println("Introduce en número 1");
        double n1 = sc.nextDouble();
        System.out.println("Introduce el número 2");
        double n2 = sc.nextDouble();
        if (n2 > 0) {
            return n1 / n2;
        }

        return 0;
    }
}
