package ud1;

import java.util.Scanner;

public class ConvertirExpresiones {
    public static void main(String[] args) {
        double a = 3 / 2 + 4 / 3;
        System.out.println("============= Resultado A =============");
        System.out.println(a);
        System.out.println("============= B =============");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Introduce el valor de Y: ");
        double y = sc.nextDouble();
        sc.close();
        double b = 1 / (x - 5) - 3 * x * y / 4;
        System.out.println("============= Resultado B =============");
        System.out.println(b);

    }
}
