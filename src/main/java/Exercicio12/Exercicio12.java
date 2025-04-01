package Exercicio12;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String usuario1 = solicitarNomeUsuario(scanner, "Nome do primeiro usuário: ");
        String usuario2 = solicitarNomeUsuario(scanner, "Nome do segundo usuário: ");

        String[] mensagens = new String[10];


        for (int i = 0; i < 10; i++) {

            String usuarioAtual = (i % 2 == 0) ? usuario1 : usuario2;
            mensagens[i] = solicitarMensagemUsuario(scanner, usuarioAtual);
        }


        System.out.println("\n===== Histórico de Mensagens =====");
        for (int i = 0; i < 10; i++) {

            String usuario = (i % 2 == 0) ? usuario1 : usuario2;
            System.out.println(usuario + ": " + mensagens[i]);
        }


        System.out.println("\nObrigado por utilizarem o nosso sistema!");

        scanner.close();
    }


    public static String solicitarNomeUsuario(Scanner scanner, String mensagem) {
        String nome = "";
        boolean nomeValido = false;

        while (!nomeValido) {
            System.out.print(mensagem);
            nome = scanner.nextLine().trim();
            if (!nome.isEmpty()) {
                nomeValido = true;
            } else {
                System.out.println("Erro: O nome não pode estar vazio. Tente novamente.");
            }
        }

        return nome;
    }


    public static String solicitarMensagemUsuario(Scanner scanner, String usuario) {
        String mensagem = "";
        boolean mensagemValida = false;

        while (!mensagemValida) {
            System.out.print(usuario + ", digite sua mensagem: ");
            mensagem = scanner.nextLine().trim();
            if (!mensagem.isEmpty()) {
                mensagemValida = true;
            } else {
                System.out.println("Erro: A mensagem não pode estar vazia. Tente novamente.");
            }
        }

        return mensagem;
    }
}
