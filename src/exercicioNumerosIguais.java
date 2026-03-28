import java.util.Scanner;

public class exercicioNumerosIguais {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro de quatro dígitos:");
        int numeroInteiro = sc.nextInt();

        if (numeroInteiro > 9999 || numeroInteiro < 1000) {
            System.out.println("Valor informado é maior ou menor que quatro dígitos.");
            exercicioNumerosIguais.main(new String[0]);
        }

        String numeroInvertido = String.valueOf(numeroInteiro);

        if (numeroInvertido.equalsIgnoreCase(inverter(numeroInvertido))) {
            System.out.println("Valor é palímetro");
        } else {
            System.out.println("Valor não é palímetro");
        }
    }

    public static String inverter(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}