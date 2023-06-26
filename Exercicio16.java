import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Inicio
        System.out.println("Prática 03: Mudança de Mês");
        System.out.println("--------------------------");
        //Inputs
        System.out.print("Digite o dia anterior: ");
        int diaAnterior = input.nextInt();
        System.out.print("Digite o dia atual: ");
        int diaAtual = input.nextInt();
        System.out.println("--------------------------");
        //Condicões/Respostas
        if (diaAnterior ==31 && diaAtual ==1) {
            System.out.print("Estão em um novo mês.");
        }
        else if (diaAnterior >=1 && diaAtual <=31) {
            System.out.print("Ainda se encontram no mesmo mês.");
        }
        else if (diaAnterior <=0 || diaAtual >=32) {
            System.out.print("Um dos dias esta errado, digite novamente.");
        }
        input.close();
    }  
}
