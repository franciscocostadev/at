package Exercicio7;

public class Aluno {
    private String nomeDoAluno;
    private String matriculaDoAluno;
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;


    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nomeDoAluno = nome;
        this.matriculaDoAluno = matricula;
        this.primeiraNota = nota1;
        this.segundaNota = nota2;
        this.terceiraNota = nota3;
    }


    public double calcularNotaMedia() {
        return (primeiraNota + segundaNota + terceiraNota) / 3;
    }


    public String getNome() {
        return nomeDoAluno;
    }

    public String getMatricula() {
        return matriculaDoAluno;
    }

    public double getNota1() {
        return primeiraNota;
    }

    public double getNota2() {
        return segundaNota;
    }

    public double getNota3() {
        return terceiraNota;
    }
}
