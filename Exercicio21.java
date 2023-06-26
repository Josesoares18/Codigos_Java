import java.util.Scanner;
public class Exercicio21
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        System.out.print("Exercício 02: Mais números pares ou ímpares.");
		int numerosPares = 0, numerosImpares = 0, i = 0;
		
		while(i < 6){
		    System.out.print("Informe um número inteiro: ");
		    int numeroInteiro = ler.nextInt();
		    
		    if (numeroInteiro %2 == 0){
		        numerosPares++;
		    }
		    else if (numeroInteiro %2 == 1){
		        numerosImpares++;
		    }
		    i++;
		}
		
		if (numerosImpares > numerosPares){
		    System.out.println("\nForam informados mais números ímpares.");
		}
		else if (numerosImpares < numerosPares){
		    System.out.println("\nForam informados mais números pares.");
		}
		else{
		    System.out.println("\nForam informados quantidade iguais de números ímpares e pares.");
		}
        ler.close();
		
	}}