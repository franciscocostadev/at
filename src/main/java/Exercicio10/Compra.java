package Exercicio10;

import java.io.*;

class Compra {
    private String produto;
    private int quantidade;
    private double precoUnidade;

    public Compra(String produto, int quantidade, double precoUnidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnidade = precoUnidade;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public double calcularTotal() {
        return quantidade * precoUnidade;
    }

    @Override
    public String toString() {
        return "Produto: " + produto + ", Quantidade: " + quantidade + ", Preço unidade: R$" + precoUnidade + ", Total: R$" + calcularTotal();
    }

    public String toFileFormat() {
        return produto + ";" + quantidade + ";" + precoUnidade;
    }

    public static void exibirComprasDoArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double precoUnidade = Double.parseDouble(dados[2]);

                System.out.println("Produto: " + produto + ", Quantidade: " + quantidade + ", Preço unidade: R$" + precoUnidade);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
