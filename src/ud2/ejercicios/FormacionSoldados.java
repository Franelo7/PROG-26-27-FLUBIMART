package ud2.ejercicios;

import java.util.Scanner;

public class FormacionSoldados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número de soldados: ");
        int n = sc.nextInt();
        sc.close();
        formacionSoldados(n);
    }

    static void formacionSoldados(int n) {
        int soldados = n;
        int lado = (int) Math.sqrt(soldados);
        int restantes = (int) (soldados - Math.pow(lado, 2));
        System.out.println("Formación Cuadrada: " + (int) Math.pow(lado, 2) + " soldados");
        formacionCuadrada(lado);
        if (restantes >= 4) {
            formacionSoldados(restantes);
        } else if (restantes < 4 && restantes != 0) {
            System.out.println("Formación en línea: " + restantes + " soldados");
            formacionLinea(restantes);
        }
    }

    static void formacionCuadrada(int lado) {
        for (int i = 0; i < lado; i++) {
            formacionLinea(lado);
            System.out.println();
        }
    }

    static void formacionLinea(int lado) {
        for (int j = 0; j < lado; j++) {
            System.out.print("* ");
        }
    }

}
