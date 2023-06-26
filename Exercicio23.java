import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        System.out.print("Exercício 03: Menor nota.\n");

        Scanner ler = new Scanner(System.in);
        int menorNota = 0, i = 0;

		while(i<6){
		    System.out.print("Informe a nota do aluno " + (i+1) + ": ");
		    int notaAluno = ler.nextInt();
		    
		    if(i == 0 || notaAluno < menorNota){
		        menorNota = notaAluno;
		    }
		    i++;
		}
		System.out.println("\nA menor das notas informadas é: " + menorNota);

        ler.close();
    }
}
