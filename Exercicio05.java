import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Faça um programa que leia dois números e imprima o maior deles.");
        System.out.println(" ");

        System.out.print("Digite o primeiro número: ");
        int priNumero = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int segNumero = input.nextInt();
        System.out.println(" ");

        if (priNumero > segNumero){
            System.out.print("O maior numero é: " + priNumero);
        }
        if (priNumero == segNumero){
            System.out.print("Os numeros são iguais.");
        }
        else {
            System.out.print("O menor numero é: " + segNumero);
        }
        input.close();
    }
}
