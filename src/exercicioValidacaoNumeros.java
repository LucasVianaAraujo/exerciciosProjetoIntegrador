import java.util.Scanner;

public class exercicioValidacaoNumeros {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = sc.nextInt();
        System.out.println("Informe um número");
        int n2 = sc.nextInt();
        System.out.println("Informe um número");
        int n3 = sc.nextInt();

        System.out.printf("Seus números: %02d, %02d e %02d\n",n1,n2,n3);
        System.out.printf("Maior número: %02d\n",Math.max(n1, Math.max(n2,n3)));
        System.out.printf("Menor número: %02d\n",Math.max(n1, Math.max(n2,n3)));
        if (n1 == n2 && n1 == n3 && n2 == n1 && n2 == n3 && n3 == n1 && n3 == n2) {
            System.out.println("Ao menos uma inserção equivalente");
        } else {
            System.out.println("Inserção exclusiva");
        }
    }
}
