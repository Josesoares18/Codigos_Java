import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercício 01: Situação da estrada");
        System.out.println("---------------------------");

        System.out.print("Digite a temperatura do dia: ");
        int tempDia = input.nextInt();
        System.out.print("Digite a temperatura média: ");
        int tempMedia = input.nextInt();
        input.close();

        if (tempDia > tempMedia) {
            System.out.println("A estrada esta liberada.");
        }
        else if (tempDia < tempMedia) {
            System.out.println("A estrada esta bloquada.");
        }
        else {
            System.out.println("Digite novamente.");
        }
    }
}
