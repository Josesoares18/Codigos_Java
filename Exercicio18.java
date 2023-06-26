import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o número do dia (1-domingo, 2-segunda, ...): ");
            int dia = sc.nextInt();

            System.out.print("Digite o número do mês: ");
            int mes = sc.nextInt();

            if (mes % 2 == 0) {
                if (dia == 1 || dia == 7) {
                    System.out.println("Final de semana de ações sociais");
                } else {
                    System.out.println("Final de semana livre");
                }
            } else {
                System.out.println("Não é final de semana");
            }
        }
    }
}
