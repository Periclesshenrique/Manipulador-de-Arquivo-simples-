import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManipuladorDeArquivo manipulador = new ManipuladorDeArquivo();

        int opcao;

        // Menu em looping

        do { 
            System.out.println("\nMenu Principal:");
            System.out.println("1. Inserir Nome");
            System.out.println("2. Exibir Nomes");
            System.out.println("3. Apagar Arquivo");
            System.out.println("0. Sair");
            System.out.print("Digite sua opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser inserido: ");
                    String nome = scanner.nextLine();
                    manipulador.inserirNome(nome);
                case 2:
                    manipulador.exibirNomes();
                case 3:
                    manipulador.apagarArquivo();
                case 0:
                    System.out.println("Saindo do programa...");
                default:
                    System.out.println("Opção inválida!");
            }

            // Aqui irá repetir o looping até que o usuário escolher sair

        } while (opcao != 0);
        scanner.close();
    }
}