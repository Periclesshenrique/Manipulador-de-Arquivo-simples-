import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorDeArquivo {

    private final String nomeArquivo = "nomes.txt";

    // O metodo a seguir será utilizado para inserir o nome no arquivo

    public void inserirNome(String nome) {
        try {
            File arquivo = new File(nomeArquivo);

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

            FileWriter escritor = new FileWriter(arquivo, true);
            escritor.write(nome + "\n");
            escritor.close();

            System.out.println("Nome inserido com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao inserir nome: " + e.getMessage());
        }
    }

    // Em seguida realizaremos a função para exibir os nomes arquivados

    public void exibirNomes() {
        try {
            File arquivo = new File(nomeArquivo);

            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado!");
                return;
            }

            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }

            leitor.close();
        } catch (IOException e) {
            System.err.println("Erro ao exibir nomes: " + e.getMessage());
        }
    }

    // Aqui apagamos todo o arquivo (todos os nomes registrados)

    public void apagarArquivo() {
        try {
            File arquivo = new File(nomeArquivo);

            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado!");
                return;
            }

            if (arquivo.delete()) {
                System.out.println("Arquivo apagado com sucesso!");
            } else {
                System.out.println("Erro ao apagar o arquivo!");
            }
        } catch (Exception e) {
            System.err.println("Erro ao apagar o arquivo: " + e.getMessage());
        }
    }
}
