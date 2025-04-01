package Exercicio10;

import java.io.*;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "compras.txt";

        Compra[] compras = new Compra[3];
        for (int i = 0; i < 3; i++) {
            compras[i] = cadastrarCompra(scanner, i + 1);
        }

        salvarComprasEmArquivo(compras, nomeArquivo);

        System.out.println("\nCompras registradas:");
        Compra.exibirComprasDoArquivo(nomeArquivo);

        scanner.close();
    }

    private static Compra cadastrarCompra(Scanner scanner, int numeroCompra) {
        System.out.println("Cadastro da compra " + numeroCompra + ":");

        System.out.print("Produto: ");
        String produto = scanner.nextLine();

        int quantidade = 0;
        while (quantidade <= 0) {
            System.out.print("Quantidade: ");
            quantidade = scanner.nextInt();
            if (quantidade <= 0) {
                System.out.println("Quantidade inválida. Deve ser maior que zero, tente novamente.");
            }
        }

        double precoUnidade = 0;
        while (precoUnidade <= 0) {
            System.out.print("Preço por unidade: ");
            precoUnidade = scanner.nextDouble();
            if (precoUnidade <= 0) {
                System.out.println("Preço inválido. Deve ser maior que zero, tente novamente .");
            }
        }
        scanner.nextLine();

        return new Compra(produto, quantidade, precoUnidade);
    }

    private static void salvarComprasEmArquivo(Compra[] compras, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Compra compra : compras) {
                writer.write(compra.toFileFormat());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
