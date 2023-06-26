import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        // Vetor para armazenar os nomes
        String[] nomes = new String[5]; 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vetor - Prática 2: Pesquisa em vetor\n");
        
        // Loop para receber os nomes das 5 pessoas
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        System.out.print("\nDigite o nome a ser pesquisado: ");
        String nomePesquisado = scanner.nextLine();
        
        scanner.close();
        
        // Pesquisar o nome no vetor
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomePesquisado)) {
                encontrado = true;
                break;
            }
        }
        
        // Exibir o resultado da pesquisa
        if (encontrado) {
            System.out.println("\nPessoa encontrada!");
        } else {
            System.out.println("\nPessoa não encontrada!");
        }
    }
}
