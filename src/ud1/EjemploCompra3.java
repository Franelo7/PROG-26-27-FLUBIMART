package ud1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * @author Fran
 */
public class EjemploCompra3 {
    public static void main(String[] args) {
        final double IVA = 0.21;
        Scanner sc = new Scanner(System.in);

        System.out.print("Precio del Producto: ");
        double precioP = sc.nextDouble();

        System.out.print("Cantidad: ");
        double cantidadP = sc.nextDouble();

        double precioIva = precioP * cantidadP * (1 + IVA);
        double ivaP = precioIva - precioP * cantidadP;
        System.out.println();
        System.out.println("==============TICKET==============");

        System.out.println("Fecha: " + LocalDate.now() + "\nHora: " + LocalTime.now());
        System.out.printf(
                "Precio del Producto: %.2f euros %nCantidad: %.2f %nIVA: %.2f%% %nIVA: %.2f euros %nPrecio Iva: %.2f euros",
                precioP,
                cantidadP, IVA, ivaP, precioIva);

    }
}
