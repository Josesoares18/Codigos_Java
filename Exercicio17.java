import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Inicio
        System.out.println("Pratica 04: Ação Social");
        System.out.println("-----------------------");

        //Inputs
        System.out.print("Digite o dia de hoje: ");
        int diaHoje = input.nextInt();
        System.out.print("Digite o mês: ");
        int mesAtual = input.nextInt();
        System.out.println("-----------------------");

        //Condições|Respostas
        if (diaHoje != 1 && diaHoje != 7) {
            System.out.println("Não é final de semana");
        }
        else if (mesAtual % 2 == 0) {
            if (diaHoje == 1 || diaHoje == 7) {
                System.out.println("Final de semana de ações sociais");
            }
        } 
        else if (mesAtual % 2 != 0) {
            if (diaHoje == 1 || diaHoje == 7) {
                System.out.println("Final de semana livre");
            }   
            
        input.close();
    }
}
}
