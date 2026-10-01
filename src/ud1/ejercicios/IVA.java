package ud1.ejercicios;

import java.util.Scanner;

public class IVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        double baseImponible = sc.nextDouble();
        System.out.print("Introduce el IVA: ");
        double iva = sc.nextDouble();
        sc.close();
        double precioIva = baseImponible * (iva / 100);
        double precioFinal = baseImponible + precioIva;

        System.out.println(
                String.format("=========== TICKET =========== \n Precio: %.2f \n IVA: %.2f \n Precio Total: %.2f ",
                        baseImponible, precioIva, precioFinal));
    }
}
