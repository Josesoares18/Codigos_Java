import java.util.Scanner;
public class Exercicio50 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Mercado\n");

        System.out.print("Digite o valor do produto: R$");
        double valorProduto = scan.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidadeProduto = scan.nextInt();

        double valorTotal = valorProduto * quantidadeProduto;
        System.out.print("\nO valor total da compra é de: " + valorTotal + " reais" + "\n");

        if (valorTotal >= 100) {
            double porcentagem = 5;
            double desconto = valorTotal * porcentagem / 100;
            System.out.print("\nO desconto obtido na compra é de: " + desconto + " reais" + "\n");
        }
        else if (valorTotal > 200) {
            double porcentagem = 10;
            double desconto = valorTotal * porcentagem / 100;
            System.out.print("\nO desconto obtido na compra é de: " + desconto + " reais" + "\n");
        }
        else if (valorTotal < 100) {
            System.out.println("Sem desconto");
        }

        System.out.print("\nVolte sempre!");
        

        

        scan.close();
    }
}
