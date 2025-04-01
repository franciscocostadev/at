package exercicio2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é seu nome: ");
        String nome = scanner.nextLine();

        String criarSenha;
        while (true) {
            System.out.print("Crie uma senha forte: ");
            criarSenha = scanner.nextLine();

            String mensagemErro = validarSenhaCriada(criarSenha);

            if (mensagemErro == null) {
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } else {
                System.out.println("Erro: " + mensagemErro);
            }
        }

        scanner.close();
    }

    public static String validarSenhaCriada(String criarSenha) {
        if (criarSenha.length() < 25) {
            return "A senha deve ter pelo menos 25 caracteres.";
        }
        if (!Pattern.compile("[A-Z]").matcher(criarSenha).find()) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        if (!Pattern.compile("\\d").matcher(criarSenha).find()) {
            return "A senha deve conter pelo menos um número.";
        }
        if (!Pattern.compile("[!@#$%^&*()_+\\-={}\\[\\]:;'<>,.?/|\\\\]").matcher(criarSenha).find()) {
            return "A senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        }

        return null;
    }
}
