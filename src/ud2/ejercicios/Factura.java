package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         Factura
 */

public class Factura {
    public static void main(String[] args) {

        final int IVA = 21;
        final int DESCUENTO = 5;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Introduce la cantidad: ");
        int cantidad = sc.nextInt();
        sc.close();

        double total = precio * cantidad;
        total += total * (IVA / 100.);

        if (total > 100) {
            total -= total * (DESCUENTO / 100.);
            System.out.println("Se ha aplicado un descuento");
        }
        System.out.printf("El precio final es de: %.2f euros", total);

    }
}
