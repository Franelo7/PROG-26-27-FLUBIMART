package ud2.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Fran
 * Supermercado
 */
public class Supermercado {
    static Scanner sc = new Scanner(System.in);

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
            atenderAOtro();
        } else if (n == 2) {
            System.out.println("Pago finalizado.");
            atenderAOtro();

        } else {
            System.out.println("Opción no contemplada!!!!");
            metodoPago(importe);
        }
    }

    static void pagoEfectivo(double precio) {

        System.out.print("Introduce billetes y/o monedas: ");
        double otorgadoCliente = solicitar();
        if (Math.abs(otorgadoCliente - precio) < 0.001) {
            System.out.printf("Pagado: %.2f euros\nCambio: 0,00 euros\n", otorgadoCliente);
        } else if (otorgadoCliente < precio) {
            System.out.println("Dinero insuficiente!!!");
            pagoEfectivo(precio);
        } else {
            // Pasamos a céntimos redondeando a entero
            int cambio = (int) Math.round((otorgadoCliente - precio) * 100);
            imprimirCambio(cambio);
        }

    }

    private static void atenderAOtro() {
        System.out.println("Atender a otro cliente? 1=SI / 2=NO");
        int n = (int) solicitar();
        if (n == 1) {
            cajaCobro();
        } else {
            System.out.println("Hasta Luego!!!!");
        }
    }

    public static void imprimirCambio(int cambio) {
        System.out.printf("El cambio a devolver es de: %.2f euros\n", cambio / 100.0);

        // Cada llamada descuenta lo que puede y devuelve lo que sobra
        cambio = entregar(cambio, 5000, "Billetes de 50 euros");
        cambio = entregar(cambio, 2000, "Billetes de 20 euros");
        cambio = entregar(cambio, 1000, "Billetes de 10 euros");
        cambio = entregar(cambio, 500, "Billetes de 5 euros");
        cambio = entregar(cambio, 200, "Monedas de 2 euros");
        cambio = entregar(cambio, 100, "Monedas de 1 euro");
        cambio = entregar(cambio, 50, "Monedas de 50 centimos");
        cambio = entregar(cambio, 20, "Monedas de 20 centimos");
        cambio = entregar(cambio, 10, "Monedas de 10 centimos");
        cambio = entregar(cambio, 5, "Monedas de 5 centimos");
        cambio = entregar(cambio, 2, "Monedas de 2 centimos");
        cambio = entregar(cambio, 1, "Monedas de 1 centimo");
    }

    static int entregar(int saldo, int valor, String texto) {
        int unidades = saldo / valor;
        if (unidades > 0) {
            System.out.println(texto + ": " + unidades);
        }
        return saldo % valor;
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
            sc.nextLine();
            return solicitar();
        }

    }
}
