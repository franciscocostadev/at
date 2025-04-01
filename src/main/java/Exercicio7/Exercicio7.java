package Exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Terceira nota: ");
        double nota3 = scanner.nextDouble();


        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);


        double media = aluno.calcularNotaMedia();
        System.out.println("\nSituação do aluno " + aluno.getNome() + " (" + aluno.getMatricula() + "):");


        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }


        System.out.println("Média do aluno: " + media);

        scanner.close();
    }
}
