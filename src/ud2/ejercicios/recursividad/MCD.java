package ud2.ejercicios.recursividad;
    /**
     * @author Fran
     * MCD
     */
public class MCD {
    public static void main(String[] args) {
        System.out.println(mcdRecursivo(10, 10));
        System.out.println(mcdIterativo(10, 10));
    }

    static int mcdRecursivo(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (b >= a) {
            return mcdRecursivo(a, b - a);
        }
        return mcdRecursivo(a - b, b);

    }

    static int mcdIterativo(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (b >= a) {
            int x = 0;
            for (int i = 1; i <= b; i++) {
                if (b % i == 0 && a % i == 0) {
                    x = Math.max(i, x);
                }

            }
            return x;
        }
        int x = 0;
        for (int i = 1; i <= a; i++) {
            if (b % i == 0 && a % i == 0) {
                x = Math.max(i, x);
            }

        }
        return x;
    }

}
