import java.util.Scanner;

public class exercicioEstacionamento {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas reservadas:");
        int horasReservadas = sc.nextInt();

        if (horasReservadas <= 0) {
            System.out.println("Quantidade de horas reservadas inválida! Tente novamente...");
        }

        if (horasReservadas == 1) {
            System.out.printf("Tempo reservado: %02d horas\n",horasReservadas);
            System.out.println("Valor Final R$5");
        } else if (horasReservadas >= 2 && horasReservadas <= 3) {
            System.out.printf("Tempo reservado: %02d horas\n",horasReservadas);
            System.out.println("Valor Final R$10");
        } else if (horasReservadas >= 3 && horasReservadas <= 6) {
            System.out.printf("Tempo reservado: %02d horas\n",horasReservadas);
            System.out.println("Valor Final R$15");
        } else if (horasReservadas > 6) {
            System.out.printf("Tempo reservado: %02d horas\n",horasReservadas);
            System.out.println("Valor Final  R$20");
        }
    }
}
