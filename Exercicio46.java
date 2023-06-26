import java.util.Scanner;
public class Exercicio46 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final double porcentagem = 5;

        System.out.println("Mercado\n");

        System.out.print("Digite o valor do produto: R$");
        double valorProduto = scan.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidadeProduto = scan.nextInt();

        double valorTotal = valorProduto * quantidadeProduto;
        System.out.print("\nO valor total da compra é de: " + valorTotal + " reais" + "\n");

        double desconto = valorTotal * porcentagem / 100;
        System.out.print("\nO desconto obtido na compra é de: " + desconto + " reais" + "\n");

        System.out.print("\nVolte sempre!");

        scan.close();
    }
}
