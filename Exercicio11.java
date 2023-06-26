import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Exercício 01: Situação da estrada");
        System.out.println("---------------------------");

        int tempIdeal = 21;
        System.out.print("Digite a temperatura do primeiro dia: ");
        int tempPrimDia = input.nextInt();
        System.out.print("Digite a temperatura do segundo dia: ");
        int tempSeguDia = input.nextInt();
        //System.out.print("Digite a temperatura do terceiro dia: ");
        //int tempTercDia = input.nextInt();
       

        int tempMedia = tempPrimDia + tempSeguDia / 2;

        if (tempIdeal > tempMedia) {
            System.out.println("A estrada esta liberada.");
        }
        else if (tempIdeal < tempMedia) {
            System.out.println("A estrada esta bloquada.");
        }
        else {
            System.out.println("Digite novamente.");
        }
        input.close();
    }
}
