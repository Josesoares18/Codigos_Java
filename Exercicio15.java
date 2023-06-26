import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Inicio
        System.out.println("Prática 02: Decretação de Feriado");
        System.out.println("---------------------------------");

        //Perguntas
        System.out.print("Digite o dia do mês: ");
        int diaMes = input.nextInt();
        System.out.print("Digite a temperatura deste dia: ");
        int tempeDia = input.nextInt();
        System.out.println("---------------------------------");

        //Condicões/Respostas
        if (diaMes<=7 && diaMes>=1) {
            if (tempeDia<0) {
                System.out.println("Feriado decretado.");
            }
            else {
                System.out.println("Feriado não decretado.");
            }
        }
        else if (diaMes<=0 || diaMes>=32) {
            System.out.println("Dia errado, digite novamente.");
        }
        else {
            System.out.println("Dia normal e sem feriado.");
        }

    input.close();
}
}
