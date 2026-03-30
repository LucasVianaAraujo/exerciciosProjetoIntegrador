import java.util.Scanner;

public class programaAnoBissexto {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um ano:");
        int ano = sc.nextInt();

        System.out.println("Informe um mês:");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido");
            return;
        }

        Boolean bissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
        int dias;

        if (mes == 2) {
            if (bissexto) {
                dias = 29;
            } else {
                dias = 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else {
            dias = 31;
        }

        System.out.printf("Mês tem %d dias", dias);
    }
}
