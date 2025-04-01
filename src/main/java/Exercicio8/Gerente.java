package Exercicio8;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioMensal) {
        super(nome, salarioMensal);
    }

    @Override
    public double calcularSalarioFuncionario() {
        return getSalarioMensal() * 1.20;
    }
}
