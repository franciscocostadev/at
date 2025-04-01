package Exercicio6;

public class Veiculo {

    private String placa;
    private String modelo;
    private int anoDeFabricacao;
    private double quilometragem;


    public Veiculo(String placa, String modelo, int anoDeFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometragem = quilometragem;
    }


    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }


    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("Viagem registrada! " + km + " km adicionados.");
        } else {
            System.out.println("Valor de quilometragem inválido.");
        }
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoDeFabricacao = anoFabricacao;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
