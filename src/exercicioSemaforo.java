import java.util.Scanner;

public class exercicioSemaforo {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pedestres para atravessar?");
        Boolean situacao1 = sc.nextBoolean();

        System.out.println("Veículos na pista?");
        Boolean situacao2 = sc.nextBoolean();

        if (situacao1 && situacao2) {
            System.out.println("Situação: Prioridade é dos veículos");
        } else {
            if (situacao1 && !situacao2) {
                System.out.println("Situação: Prioridade é dos pedestres");
            } else {
                System.out.println("Situação: Farol continua igual");
            }
        }
    }
}
