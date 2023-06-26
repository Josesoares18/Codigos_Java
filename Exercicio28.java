import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("String - prática 03: Capitular\n");

            System.out.print("\nDigite um texto: ");
            String primeiroTexto = input.nextLine();

            String textoConvertido = converterTexto(primeiroTexto);

            System.out.println("\nTexto convertido: " + textoConvertido);
        }
    }
    
    public static String converterTexto(String texto) {
        String primeiraLetra = texto.substring(0, 1).toUpperCase();
        String restanteTexto = texto.substring(1).toLowerCase();

        return primeiraLetra + restanteTexto;
    }

}
