import java.util.Scanner;

public class estrutura_Sequencial_EX02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.next();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos. ");
    }
}
