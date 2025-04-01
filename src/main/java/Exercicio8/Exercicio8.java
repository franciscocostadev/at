package Exercicio8;

public class Exercicio8 {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Francisco Costa", 5500.0);
        Funcionario estagiario = new Estagiario("Ana Silva", 1800.0);


        System.out.println("Salário do Gerente " + gerente.getNome() + ": " + gerente.calcularSalarioFuncionario());
        System.out.println("Salário do Estagiário " + estagiario.getNome() + ": " + estagiario.calcularSalarioFuncionario());
    }
}
