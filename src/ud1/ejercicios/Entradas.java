package ud1.ejercicios;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        final double ADULTOS = 20;
        final double NINOS = 15.50;
        final double DESCUENTO = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de entradas para niños: ");
        int ninos = sc.nextInt();
        System.out.print("Cantidad de entradas para adultos: ");
        int adultos = sc.nextInt();
        sc.close();
        double precioTotal = adultos * ADULTOS + ninos * NINOS;

        double descuento = precioTotal >= 100 ? precioTotal - precioTotal * (DESCUENTO / 100) : precioTotal;

        System.out.printf("El precio total es de: %.2f", descuento);

    }
}
