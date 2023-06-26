import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("String - Pratica 02: Contar palavras\n");

        System.out.print("Digite uma frase: ");
        String frase = ler.nextLine();
        
        int contador = contarPalavras(frase);
        System.out.print("\nNumero de palavras na frase: " + contador);

        ler.close();
    }

    public static int contarPalavras(String frase) {
        if (frase == null || frase.isEmpty()) {
            return 0;
        }
        
        String[] palavras = frase.split("\\s+");
        return palavras.length;
}
}