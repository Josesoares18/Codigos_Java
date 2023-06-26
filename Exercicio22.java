import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        System.out.print("Exercício 03: Maior idade.\n");

        Scanner ler = new Scanner(System.in);
        int maiorIdade = 0, i = 0;

		while(i<5){
		    System.out.print("Informe a idade da pessoa " + (i+1) + ": ");
		    int idade = ler.nextInt();
		    
		    if(idade > maiorIdade){
		        maiorIdade = idade;
		    }
		    i++;
		    
		}
		
		System.out.println("\nA maior das idades informadas é: " + maiorIdade);

        ler.close();
    }
}
