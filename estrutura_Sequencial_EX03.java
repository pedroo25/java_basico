import java.util.Scanner;

public class estrutura_Sequencial_EX03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        double salario = sc.nextDouble();

        double aumento = salario + (salario * 0.10);

        System.out.println("Seu salário com aumento de 10%: R$" + aumento);
    }
}
