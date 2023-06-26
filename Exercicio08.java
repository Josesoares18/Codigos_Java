import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Faça um programa que leia três números e imprima o maior deles.");
        System.out.println("--------------------------------");

        System.out.print("Digite o primeiro número: ");
        int priNum = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segNum = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int terNum = input.nextInt();
        System.out.println("--------------------------------");

        if (priNum > segNum && priNum > terNum) {
            System.out.println("Este é o maior numero: " + priNum);
        }
        else if (segNum > priNum && segNum > terNum) {
            System.out.println("Este é o maior numero: " + segNum);
        }
        else if (terNum > priNum && terNum > segNum) {
            System.out.println("Este é o maior numero: " + terNum);
        }
        else if (priNum == segNum && segNum == terNum && terNum == segNum) {
            System.out.println("Os numero sao iguais.");
        }
        input.close();
        
    }
}
