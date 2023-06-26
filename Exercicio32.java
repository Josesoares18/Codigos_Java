import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Questão 03: Arredondamento personalizado");

            System.out.print("\nDigite a nota: ");
            double nota = input.nextDouble();

            double notaArredondada = arredondarNota(nota);

            System.out.println("\nA nota arredondada é: " + notaArredondada);
        }
    }

    public static double arredondarNota(double nota) {
        int parteInteira = (int) nota;
        double parteDecimal = nota - parteInteira;

        if (parteDecimal <= 0.2) {
            return parteInteira;
        } else if (parteDecimal >= 0.8) {
            return parteInteira + 1;
        } else {
            return parteInteira + 0.5;
        }
    }
}
