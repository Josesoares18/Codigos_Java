import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        
        List<Integer> idades = new ArrayList<>(); 

        System.out.println("Vetor - Prática 01: Média da Terceira Idade\n");

        Scanner scanner = new Scanner(System.in);
        
        // Loop para receber as idades das 5 pessoas
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            idades.add(idade);
        }
        
        scanner.close();
        
        // Filtrar as idades da terceira idade (60 anos ou mais)
        List<Integer> terceiraIdade = new ArrayList<>();
        for (int idade : idades) {
            if (idade >= 60) {
                terceiraIdade.add(idade);
            }
        }
        
        // Calcular a média das idades da terceira idade
        double mediaTerceiraIdade = 0;
        if (!terceiraIdade.isEmpty()) {
            int soma = 0;
            for (int idade : terceiraIdade) {
                soma += idade;
            }
            mediaTerceiraIdade = (double) soma / terceiraIdade.size();
        }
        
        // Exibir a média das idades da terceira idade
        System.out.printf("\nA média das idades da terceira idade é: %.2f", mediaTerceiraIdade);
    }
}
