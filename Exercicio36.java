import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Math - Pratica 02: Potencia Eletrica\n");

        System.out.print("Digite o valor de U (tensao eletrica): ");
        double tensaoEletrica = ler.nextDouble();

        System.out.print("Digite o valor de R (resistencia eletrica): ");
        double resisEletrica = ler.nextDouble();

        double teResp = Math.sqrt(tensaoEletrica);

        double potencia = teResp / resisEletrica;

        System.out.println("\nO valor da pontencia eletrica é igual a " + potencia);

        ler.close();
    }
}
