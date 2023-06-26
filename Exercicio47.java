import java.util.Scanner;

public class Exercicio47 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Operadores aritméticos\n");

        System.out.print("Digite o primeiro numero: ");
        int primeiroumero = sc.nextInt();
        System.out.print("Digite o segunto numero: ");
        int segundoumero = sc.nextInt();

        int adicao = primeiroumero + segundoumero;
        System.out.print("\nO valor da adicao é igual a: " + adicao + "\n");

        int subtracao = primeiroumero - segundoumero;
        System.out.print("O valor da subtracao é igual a: " + subtracao + "\n");

        int multiplicacao = primeiroumero * segundoumero;
        System.out.print("O valor da multiplicacao é igual a: " + multiplicacao + "\n");

        double divisao = primeiroumero / segundoumero;
        System.out.print("O valor da divisao é igual a: " + divisao + "\n");

        double moduloOuRestante = primeiroumero % segundoumero;
        System.out.print("O valor da restante é igual a: " + moduloOuRestante + "\n");

        sc.close();
    }

    }
