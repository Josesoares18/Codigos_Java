import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Questão 02: Diagonal do retângulo");

            System.out.print("\nDigite a base do retângulo: ");
            double valorBase = input.nextDouble();

            System.out.print("Digite a altura do retângulo: ");
            double valorAltura = input.nextDouble();

            double diagonal = calcularDiagonal(valorBase, valorAltura);

            System.out.println("\nA diagonal do retângulo é: " + diagonal);
        }
    }

    public static double calcularDiagonal(double valorBase, double valorAltura) {
        return Math.sqrt(valorBase * valorBase + valorAltura * valorAltura);
    }
}
