import java.util.Scanner;
public class Exercicio02
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Escola Nada a Jato");
    System.out.println(" ");
    /*Valor de juros */
    final double valorDeJuros = 2.50;

    /*Atribuido valor */
    System.out.print("Digite a quantidade de dias de atraso: ");
    double diasDeAtraso = input.nextDouble();
    System.out.print("Digite o valor da sua parcela: ");
    double parcelaPagar = input.nextDouble();  

    /*Calculos */
    double valorTotalJuros = valorDeJuros * diasDeAtraso;
    double valorTotal = valorTotalJuros + parcelaPagar;

    /*Resultado */
    System.out.println(" ");
    System.out.println("O valor dos juros a pagar é igual a: R$" + valorTotalJuros);
    System.out.println("O valor total a pagar é igual a: R$" + valorTotal);
    input.close();  
    }
}