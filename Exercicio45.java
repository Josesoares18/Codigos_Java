import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcular velociade média\n");

        System.out.print("Digite o valor do deslocamento: ");
        double deslocamento = scan.nextDouble();
        System.out.print("Digite o valor do intervalo de tempo: ");
        double intervaloTempo = scan.nextDouble();

        double velocidadeMedia = deslocamento / intervaloTempo;
        System.out.println("\nO resultado é igual a: " + velocidadeMedia);

        scan.close();
    }
}
