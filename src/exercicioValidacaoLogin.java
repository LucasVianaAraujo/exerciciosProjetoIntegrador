import java.util.Scanner;

public class exercicioValidacaoLogin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Email:");
        String email = sc.nextLine();

        if (email.equalsIgnoreCase("admin")) {
            System.out.println("Senha:");
            String senha = sc.nextLine();
            if (senha.equalsIgnoreCase("1234")) {
                System.out.println("Acesso concedido!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            System.out.println("Email incorreto!");
        }
    }
}