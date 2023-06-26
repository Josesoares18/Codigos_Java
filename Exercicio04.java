import java.util.Scanner;
public class Exercicio04 {
    public static void main (String[] args) {
            try (Scanner input = new Scanner (System.in)) {
                System.out.println("Faça um programa que leia dois números e imprima a soma.");
                System.out.println(" ");

                System.out.print("Digite o primeiro número: ");
                int priNumero = input.nextInt();
                System.out.print("Digite o segundo número: ");
                int segNumero = input.nextInt();
                System.out.println(" ");

                int soma = priNumero + segNumero;
                System.out.printf("A soma dos numero é igual a: " + soma);
                input.nextInt();
            }
        }


        
    }
