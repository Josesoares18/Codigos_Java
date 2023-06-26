import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercício 03: Crítica da hora e minuto");
        System.out.println("--------------------------------------");
        
        // Entrada de dados
        System.out.print("Digite a hora: ");
        int horario = input.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = input.nextInt();

        //Condições/Saida
        if (horario < 0 || minutos < 0 || horario > 23 || minutos > 59){
            System.out.println("Hora ou minutos estão errados. Digite novamente.");
        }
        else {
            System.out.printf("O horario esta correto. São %s horas e %s minutos.", horario, minutos);
        }
        input.close();
    }
}
