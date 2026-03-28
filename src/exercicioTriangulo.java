import java.util.Scanner;

public class exercicioTriangulo {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro triângulo:");
        int t1 = sc.nextInt();

        System.out.println("Informe o valor do segundo triângulo:");
        int t2 = sc.nextInt();

        System.out.println("Informe o valor do terceiro triângulo:");
        int t3 = sc.nextInt();

        if (t1 == t2 && t1 == t3 && t2 == t1 && t2 == t3 && t3 == t1 && t3 == t2) {
            System.out.println("Os triângulos são Equilátero (Todos os lados são congruentes).");
        } else if (t1 == t2 || t1 == t3 || t2 == t1 || t2 == t3 || t3 == t1 || t3 == t2) {
            System.out.println("Os triângulos são Isósceles (Pelo menos um dos lados é congruente).");
        } else if (t1 != t2 && t1 != t3 && t2 != t1 && t2 != t3 && t3 != t1 && t3 != t2) {
            System.out.println("Os triângulos são palímetros (Nenhum dos lados do triângulo é congruente).");
        } else {
            System.out.println("Valores não permitidos");
        }
    }
}