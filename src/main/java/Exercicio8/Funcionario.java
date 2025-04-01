package Exercicio8;

public class Funcionario {
    private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }


    public double calcularSalarioFuncionario() {
        return salarioMensal;
    }
}
