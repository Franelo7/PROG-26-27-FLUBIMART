package ud2.ejercicios;

public class MinutosTranscurridos {
    /**
     * @author Fran
     */
    public static void main(String[] args) {
        System.out.println(diferenciaMin(15, 20, 16, 20));
    }

    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {

        int totalMins1 = hora1 * 60 + minuto1;
        int totalMins2 = hora2 * 60 + minuto2;

        return Math.abs(totalMins1 - totalMins2);
    }
}
