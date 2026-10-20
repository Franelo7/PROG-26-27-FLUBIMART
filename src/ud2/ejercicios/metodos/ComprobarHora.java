package ud2.ejercicios.metodos;

/** @author Fran */

public class ComprobarHora {
    public static void main(String[] args) {
        compruebaHora(2, 70, 0);
    }

    static void compruebaHora(int hora, int minutos, int segundos) {

        if (hora < 0 || hora > 24 || minutos < 0 || minutos > 60 || segundos < 0 || segundos > 60) {
            System.out.println("Hora no válida");
        } else {
            System.out.println("Hora válida");
        }

    }
}
