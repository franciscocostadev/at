package exercicio4;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();


        System.out.print("Qual é o valor do empréstimo que você deseja? R$ ");
        double valorDoEmprestimo = scanner.nextDouble();

        int quantidadeDeParcelas = 0;

        while (quantidadeDeParcelas < 12 || quantidadeDeParcelas > 60) {
            System.out.print("Quantas parcelas você quer pagar (de 12 a 60 no máximo)? ");
            quantidadeDeParcelas = scanner.nextInt();

            if (quantidadeDeParcelas < 12 || quantidadeDeParcelas > 60) {
                System.out.println("Número de parcelas inválido. Por favor, tente novamente. ");
            }
        }


        double taxaDeJuros = 0.05;


        double valorTotal = valorDoEmprestimo * Math.pow(1 + taxaDeJuros, quantidadeDeParcelas);


        double parcelaMensal = valorTotal / quantidadeDeParcelas;


        System.out.println("\nSimulação de Empréstimo para " + nome);
        System.out.println("Valor do empréstimo: R$ " + valorDoEmprestimo);
        System.out.println("Taxa de juros mensal: 5%");
        System.out.println("Quantidade de parcelas: " + quantidadeDeParcelas);
        System.out.println("Valor total a ser pago: R$ " + String.format("%.2f", valorTotal));
        System.out.println("Valor da parcela mensal: R$ " + String.format("%.2f", parcelaMensal));

        scanner.close();
    }
}
