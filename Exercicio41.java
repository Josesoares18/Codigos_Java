import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("String - Prática 05: Pagamento do IPVA\n");

        System.out.print("DIgite a placa do veiculo: ");
        String placaVeiculo = ler.nextLine();

        char ultimoDigito = placaVeiculo.charAt(placaVeiculo.length() -1);

        String mesPagamento;

        switch (ultimoDigito) {
            case '1': case '2': case '3':
                mesPagamento = "Janeiro";
                break;
            case '4': case '5': case '6':
                mesPagamento = "Fevereiro"; 
                break;
            case '7': case '8': case '9': case '0':
                mesPagamento = "Março";
                break;
            default:
                mesPagamento  = "Mes invalido";
                break;
}
        System.out.println("\nO mes pagamento do IPVA é: " + mesPagamento);
    ler.close();
}
}
