import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Questão 01: Diagonal do quadrado\n");

            System.out.print("\nDigite o lado do quadrado: ");
            double valorLado = input.nextDouble();

            double valorDiagonal = calcularDiagonal(valorLado);

            System.out.println("\nA diagonal do quadrado é: " + valorDiagonal);
        }
    }

    public static double calcularDiagonal(double valorLado) {
        return valorLado * Math.sqrt(2);
    }
}
