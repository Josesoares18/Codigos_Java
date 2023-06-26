import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            int numerosPares = 0, numerosImpares = 0, i = 0;
		
		    while(i < 6){
		        System.out.print("Informe um número inteiro: ");
		        int numeroInteiro = input.nextInt();
		    
		        if (numeroInteiro %2 == 0){
		            numerosPares++;
		        }
		        else if (numeroInteiro %2 == 1){
		            numerosImpares++;
		        }
		    i++;
		}
		
		if (numerosImpares > numerosPares){
		    System.out.println("Foram informados mais números ímpares.");
		}
		else if (numerosImpares < numerosPares){
		    System.out.println("Foram informados mais números pares.");
		}
		else{
		    System.out.println("Foram informados quantidade iguais de números ímpares e pares.");
        }
        }
}
}