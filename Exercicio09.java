import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prática 01: Início de Quinzena");
        System.out.println("----------------");
        System.out.print("Digite o numero do dia do mês: ");
        int numDia = input.nextInt();
        input.close();

        if (numDia >=1 && numDia <=14) {
            System.out.println("Este é um dia normal");
            }
        if (numDia >=16 && numDia <=31) {
            System.out.println("Este é um dia normal");
        }
        if (numDia == 15) {
            System.out.println("Incio da quinzena.");
        }
        else if (numDia <=0 || numDia >31) {
            System.out.println("Digite novamente.");
        }
    }
}
