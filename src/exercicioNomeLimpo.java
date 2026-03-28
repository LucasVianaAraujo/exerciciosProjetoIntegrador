import java.util.Scanner;

public class exercicioNomeLimpo {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu salário:");
        float salario = sc.nextFloat();

        System.out.println("Seu nome está limpo ('true' = sim / 'false' = não)?");
        Boolean nomeLimpo = sc.nextBoolean();

        if (salario > 3000 && nomeLimpo == true) {
            System.out.println("Empréstimo concedido.");
        } else if (salario >= 1500 && salario <= 3000 && nomeLimpo == true) {
            System.out.println("Requer análise para conclusão do empréstimo.");
        } else if (salario >= 1500 && salario <= 3000 && nomeLimpo == false) {
            System.out.println("Empréstimo negado, contate o seu banco para mais informações");
        } else {
            System.out.println("Empréstimo negado, contate o seu banco para mais informações.");
        }
    }
}