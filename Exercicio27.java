import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("String - Prática 02: Ordenar nomes de pessoas\n");

        System.out.print("\nDigite o nome da primeira pessoa: ");
        String primeiroNome = input.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String segundoNome = input.nextLine();

        if (primeiroNome.compareToIgnoreCase(segundoNome) > 0) {
            String temp = primeiroNome;
            primeiroNome = segundoNome;
            segundoNome = temp;
        }

        System.out.println("\nNomes ordenados: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Segundo nome: " + segundoNome);

        input.close();
    }
}
