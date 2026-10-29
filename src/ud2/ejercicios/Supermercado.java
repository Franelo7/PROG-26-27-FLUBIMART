package ud2.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {
    static Scanner sc = new Scanner(System.in);
    // Billetes
    final int BILLETE5 = 5;
    final int BILLETE10 = 10;
    final int BILLETE20 = 20;
    final int BILLETE50 = 50;

    // Monedas
    final int MONEDAC1 = 1;
    final int MONEDAC2 = 2;
    final int MONEDA5 = 5;
    final int MONEDA10 = 10;
    final int MONEDA20 = 20;
    final int MONEDA50 = 50;
    final int MONEDA1 = 1;
    final int MONEDA2 = 2;

    public static void main(String[] args) {
        cajaCobro();
    }

    static void cajaCobro() {
        double total = pasoProductos();
        if (total == 0) {
            System.out.println("Hasta Luego!!!!");
        } else {
            System.out.printf("Total: %.2f euros\n", total);
            metodoPago(total);
        }
    }

    static void metodoPago(double importe) {
        System.out.println("Método de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        int n = (int) solicitar();
        if (n == 1) {
            pagoEfectivo(importe);
        } else if (n == 2) {
            System.out.println("Pago finalizado.");
            System.out.println("Hasta Luego!!!!!!");

        } else {
            System.out.println("Opción no contemplada!!!!");
            metodoPago(importe);
        }
    }

    static void pagoEfectivo(double precio) {

        System.out.print("Introduce billetes y/o monedas: ");
        double otorgadoCliente = solicitar();
        if (otorgadoCliente == precio) {
            System.out.printf("Pagado: %.2f euros\nCambio: 0,00 euros ", otorgadoCliente);
            System.out.println("Hasta Luego!!");
        } else if (otorgadoCliente < precio) {
            System.out.println("Dinero insuficiente!!!");
            pagoEfectivo(precio);
        } else {
            double cambio = otorgadoCliente - precio;
            imprimirCambio(cambio);
        }

    }

    public static void imprimirCambio(double cambio) {
        System.out.println("El cambio a devolver es de: " + cambio / 100.0 + " euros");
        double billetes50 = cambio / 5000;
        cambio %= 5000;
        double billetes20 = cambio / 2000;
        cambio %= 2000;
        double billetes10 = cambio / 1000;
        cambio %= 1000;
        double billetes5 = cambio / 500;
        cambio %= 500;
        double monedas2 = cambio / 200;
        cambio %= 200;
        double monedas1 = cambio / 100;
        cambio %= 100;
        double monedas50 = cambio / 50;
        cambio %= 50;
        double monedas20 = cambio / 20;
        cambio %= 20;
        double monedas10 = cambio / 10;
        cambio %= 10;
        double monedas5 = cambio / 5;
        cambio %= 5;
        double monedas2Cent = cambio / 2;
        cambio %= 2;
        double monedas1Cent = cambio;
        if (billetes50 > 0) {
            System.out.println("Billetes de 50 euros: " + billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20 euros: " + billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10 euros: " + billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5 euros: " + billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
        if (monedas50 > 0) {
            System.out.println("Monedas de 50 centimos: " + monedas50);
        }
        if (monedas20 > 0) {
            System.out.println("Monedas de 20 centimos: " + monedas20);
        }
        if (monedas10 > 0) {
            System.out.println("Monedas de 10 centimos: " + monedas10);
        }
        if (monedas5 > 0) {
            System.out.println("Monedas de 5 centimos: " + monedas5);
        }
        if (monedas2Cent > 0) {
            System.out.println("Monedas de 2 centimos: " + monedas2Cent);
        }
        if (monedas1Cent > 0) {
            System.out.println("Monedas de 1 centimo: " + monedas1Cent);
        }
    }

    static double calculo(double importe, int cantidad) {
        if (cantidad <= 0) {
            return 0;
        }

        double precioFinal = importe * cantidad;

        return precioFinal;
    }

    static double pasoProductos() {
        double importe;
        int cantidad;
        double precio = 0;
        boolean noEsCero = true;

        while (noEsCero) {

            System.out.print("Introduce el importe: ");
            importe = solicitar();
            if (importe > 0) {
                System.out.print("Introduce la cantidad: ");
                cantidad = (int) solicitar();
                precio += calculo(importe, cantidad);
            } else {
                noEsCero = false;
            }

        }

        return precio;

    }

    static double solicitar() {
        try {
            double n = sc.nextDouble();
            sc.nextLine();
            return n;

        } catch (InputMismatchException e) {
            System.out.print("ERROR! \nIntroduce valores numéricos!!: ");

        }
        return solicitar();
    }
}
