import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Faça um programa que leia um número e imprima se ele é par ou ímpar.");
        System.out.println("  ");
        System.out.print("Digite um numero: ");
        int primNum = input.nextInt();
        System.out.println("  ");

        if (primNum % 2 == 0) {
            System.out.print("O numero é par."); 
        }
        else {
            System.out.print("O nuumero não é par.");
        }

        input.close();
    }
}
