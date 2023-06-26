import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        System.out.println("String - Pratica 03: Email corporativo\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();
        scanner.close();

        String email = gerarEmailCorporativo(nome);
        System.out.println("\nO endereço de e-mail corporativo é: " + email);
    }

    public static String gerarEmailCorporativo(String nome) {
        String[] nomes = nome.split(" ");
        String primeiroNome = nomes[0];
        String ultimonome = nomes[nomes.length - 1];
        String primeiraLetraNome = String.valueOf(primeiroNome.charAt(0)).toLowerCase();

        if (nomes.length == 1) {
            return primeiroNome + "." + primeiraLetraNome + "." + primeiroNome + "@tecnol.com.br";
        } else if (nomes.length == 2) {
            return primeiroNome + "." + primeiraLetraNome + "." + ultimonome + "@tecnol.com.br";
        } else {
            return primeiroNome + "." + primeiraLetraNome + "." + ultimonome + "@tecnol.com.br";
        }
    }
}
