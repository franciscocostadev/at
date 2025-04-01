package exercicio3;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Qual é o seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Qual é o seu salário mensal: R$ ");
            double salarioMensal = scanner.nextDouble();


            if (salarioMensal < 0) {
                System.out.println("Ops! O salário não pode ser negativo. Tente novamente.");
                return;
            }

            double salarioAnual = salarioMensal * 12;
            double imposto = calculadorDeImposto(salarioAnual);
            double salarioLiquido = salarioAnual - imposto;

            System.out.println("\nOlá, " + nome + "!");
            System.out.println("Seu salário anual é: R$ " + salarioAnual);
            System.out.println("O valor do imposto de renda é: R$ " + imposto);
            System.out.println("Seu salário líquido anual é: R$ " + salarioLiquido);
            System.out.println("Seu salário líquido mensal é: R$ " + (salarioLiquido / 12));

        } catch (Exception e) {
            System.out.println("Erro! Por favor, insira um número válido para o valor do salário.");
        } finally {
            scanner.close();
        }
    }

    public static double calculadorDeImposto(double salarioAnual) {
        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        return imposto;
    }
}
