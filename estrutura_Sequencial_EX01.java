import java.util.Scanner;

public class estrutura_Sequencial_EX01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número 1: ");
        int n1 = sc.nextInt();

        System.out.println("Informe o número 2: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma de " + n1 + " + " + n2 + " = " + soma);
    }
}