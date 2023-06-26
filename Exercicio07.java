import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Faça um programa que leia a idade de uma pessoa e imprima se ela é maior ou menor de idade.");
        System.out.println("  ");

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("  ");

        if (idade >= 18) {
            System.out.print("Voce é maior de idade.");
        }
        else {
            System.out.print("Voce não é maior de idade.");   
        }
        input.close();
        
    }
}
