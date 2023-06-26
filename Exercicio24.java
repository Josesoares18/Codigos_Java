import java.util.Scanner;

public class Exercicio24
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Exercício 05: Maior e menor temperatura");
        System.out.println("---------------------------------------");

		int i = 0, maiorTemp = 0, menorTemp = 0;
		while (i < 7){
		    System.out.print("Informe a média da temperatura do dia: ");
		    int temperatura = input.nextInt();
		    
		    if(i == 0 || temperatura < menorTemp){
		        menorTemp = temperatura;
		    }
		    if(i == 0 || temperatura > maiorTemp){
		        maiorTemp = temperatura;
		    }
		    i++;
		}
        System.out.println("---------------------------------------");
		System.out.println("A maior temperatura da semana foi: " + maiorTemp);
		System.out.println("A menor temperatura da semana foi: " + menorTemp);

        input.close();
	}
}