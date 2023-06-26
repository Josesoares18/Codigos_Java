import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercício 02: Semáforo");
        System.out.println("----------------------");
        
        System.out.println("Velociade permitida: 100km/h: ");
        System.out.print("Digite a velocidade percorrida em km/h: ");       
        int velocPerc = input.nextInt();

        if (velocPerc <= 95) {
            System.out.print("Verde.");
        }
        else if (velocPerc >= 96 && velocPerc <= 100){
            System.out.print("Amarelo.");
        }
        else if (velocPerc >= 101){
            System.out.print("Vermelho.");
        }

        input.close();
    }
}
