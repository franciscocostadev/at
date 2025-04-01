package Exercicio11;
import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int[] numerosSorteados = new int[6];
        for (int i = 0; i < 6; i++) {

            int numero;
            do {
                numero = random.nextInt(60) + 1;
            } while (existeNumeroSorteados(numerosSorteados, numero));
            numerosSorteados[i] = numero;
        }


        int[] numerosUsuario = new int[6];
        System.out.println("Digite 6 números entre 1 e 60:");
        for (int i = 0; i < 6; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    int numero = scanner.nextInt();


                    if (numero < 1 || numero > 60) {
                        System.out.println("Erro: O número deve estar entre 1 e 60. Tente novamente.");
                    } else {
                        numerosUsuario[i] = numero;
                        numeroValido = true;
                    }
                } catch (Exception e) {

                    System.out.println("Erro: Por favor, insira um número válido.");
                    scanner.nextLine();
                }
            }
        }

        int acertos = compararNumerosSorteados(numerosSorteados, numerosUsuario);

        System.out.println("\nNúmeros sorteados:");
        for (int numero : numerosSorteados) {
            System.out.print(numero + " ");
        }
        System.out.println("\nVocê acertou " + acertos + " números. Boa sorte da próxima vez...");

        scanner.close();
    }

    public static boolean existeNumeroSorteados(int[] numeros, int numero) {
        for (int num : numeros) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }

    public static int compararNumerosSorteados(int[] sorteados, int[] usuario) {
        int acertos = 0;
        for (int i = 0; i < sorteados.length; i++) {
            for (int j = 0; j < usuario.length; j++) {
                if (sorteados[i] == usuario[j]) {
                    acertos++;
                }
            }
        }
        return acertos;
    }
}
