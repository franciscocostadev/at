package Exercicio8;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioMensal) {
        super(nome, salarioMensal);
    }

    @Override
    public double calcularSalarioFuncionario() {
        return getSalarioMensal() * 0.90;
    }
}
