package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author Fran
 * NotaEnTexto
 */
public class NotaEnTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nota en número entero: ");
        int n = sc.nextInt();
        sc.close();
        switch (n) {
            case 0, 1, 2, 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
