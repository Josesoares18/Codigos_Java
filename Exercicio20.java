import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Exercício 01: Intervalo entre dois números.");

        System.out.print("\nInforme o primeiro número: ");
        int primeiroNumero = ler.nextInt();

        System.out.print("Informe o último número: ");
        int segundoNumero = ler.nextInt();

        if (primeiroNumero > segundoNumero){
            System.out.println("\nO primeiro número tem que ser menor que o segundo.");
        }
        else {
            System.out.println("\nNúmeros ímpares:");

            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
        }
        ler.close();   
}
}
}   
}