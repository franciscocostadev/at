package Exercicio6;

public class Exercicio6 {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("ABC-1234", "Ferrari", 1995, 40000.0);
        Veiculo veiculo2 = new Veiculo("XYZ-5678", "Gol", 2025, 5000.0);


        System.out.println("Detalhes do Veículo modelo 1:");
        veiculo1.exibirDetalhes();
        System.out.println("\nDetalhes do Veículo modelo 2:");
        veiculo2.exibirDetalhes();


        System.out.println("\nRegistrando viagens:");
        veiculo1.registrarViagem(150.0);
        veiculo2.registrarViagem(300.0);


        System.out.println("\nDetalhes do Veículo 1 após viagem:");
        veiculo1.exibirDetalhes();
        System.out.println("\nDetalhes do Veículo 2 após viagem:");
        veiculo2.exibirDetalhes();
    }
}
