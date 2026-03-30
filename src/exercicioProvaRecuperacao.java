import java.util.Scanner;

public class exercicioProvaRecuperacao {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a matéria");
        String materia = sc.nextLine();

        System.out.printf("Resultado da prova 1 de %s:\n",materia);
        double prova1 = sc.nextDouble();

        System.out.printf("Resultado da prova 2 de %s:\n",materia);
        double prova2 = sc.nextDouble();

        double media = (prova1 + prova2) / 2;

        if (media >= 7) {
            System.out.printf("Média: %2.2f\n",media);
            System.out.println("Status: Aprovado");
        } else if (media > 4 && media <= 6.9) {
            System.out.printf("Média: %2.2f\n",media);
            System.out.println("Status: Recuperação\n");

            System.out.printf("Resultado da prova 1 de recuperação de %s:\n",materia);
            double prova1Recuperacao = sc.nextDouble();

            System.out.printf("Resultado da prova 1 de recuperação de %s:\n",materia);
            double prova2Recuperacao = sc.nextDouble();

            double mediaRecuperacao = (prova1Recuperacao + prova2Recuperacao) / 2;

            if (mediaRecuperacao >= 7) {
                System.out.printf("Média: %2.2f\n",mediaRecuperacao);
                System.out.println("Status: Aprovado");
            } else {
                System.out.printf("Média: %2.2f\n",mediaRecuperacao);
                System.out.println("Status: Reprovado");
            }
        } else {
            System.out.printf("Média: %2.2f\n",media);
            System.out.println("Status: Reprovado");
        }
    }
}
