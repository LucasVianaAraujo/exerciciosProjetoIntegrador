import java.util.Scanner;

public class exercicioHorario {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a hora (Exemplo: 17h = 17):");
        int hora = sc.nextInt();
        System.out.println("Informe o minuto (Exemplo: 17h32 = 32):");
        int minuto = sc.nextInt();

        if (hora >= 00 && hora <= 05 && minuto >= 00 && minuto <= 59) {
            System.out.printf("%02d:%02d Madrugada", hora, minuto);
        } else if (hora >= 06 && hora <= 11 && minuto >= 00 && minuto <= 59) {
            System.out.printf("%02d:%02d Manhã", hora, minuto);
        } else if (hora >= 12 && hora <= 17 && minuto >= 00 && minuto <= 59) {
            System.out.printf("%02d:%02d Tarde", hora, minuto);
        } else if (hora >= 18 && hora <= 23 && minuto >= 00 && minuto <= 59) {
            System.out.printf("%02d:%02d Noite", hora, minuto);
        } else {
            System.out.printf("Horário inválido");
        }
    }
}