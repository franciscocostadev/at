package Exercicio9;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);


        conta.exibirSaldo();

        System.out.print("Digite o valor para depósito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        conta.exibirSaldo();

        System.out.print("Digite o valor para saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        conta.exibirSaldo();

        scanner.close();
    }
}
