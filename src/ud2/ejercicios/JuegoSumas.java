package ud2.ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Fran
 */
public class JuegoSumas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n1, n2, resultado;
        int resultadoUsuario;
        int contador = 0;
        do {

            n1 = r.nextInt(1, 100) + 1;
            n2 = r.nextInt(1, 100) + 1;
            resultado = n1 + n2;
            System.out.print(n1 + "+" + n2 + "= ");
            resultadoUsuario = sc.nextInt();
            if (resultado == resultadoUsuario) {
                contador++;
            }
            ;

        } while (resultadoUsuario == resultado);
        sc.close();
        System.out.println("Fallaste!!!");
        System.out.println("Tuviste " + contador + " aciertos");
    }
}
