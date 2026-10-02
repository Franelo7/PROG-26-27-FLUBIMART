package ud2.ejercicios;

import java.time.LocalTime;
/**
 * @author Fran
 * BosDiasTardesNoites
 */
public class BosDiasTardesNoites {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
        if (hora.getHour() >= 7 && hora.getHour() <= 13) {
            System.out.println("Bos días");
        } else if (hora.getHour() >= 14 && hora.getHour() <= 20) {
            System.out.println("Boas tardes");
        } else {
            System.out.println("Boas noites");
        }
    }
}
