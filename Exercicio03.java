import java.util.Scanner;
public class Exercicio03
{
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Votacao");
            System.out.println("  ");
            
            System.out.print("Digite a quantidade de votos do primeiro candidato: ");
            int votosPriCand = input.nextInt();
            System.out.print("Digite a quantidade de votos do segundo candidato: ");
            int votosSegCand = input.nextInt();
            System.out.print("Digite a quantidade de votos do terceiro candidato: ");
            int votosTerCand = input.nextInt();
            System.out.println("  ");
            
            int total = (votosPriCand + votosSegCand + votosTerCand) / 2;  

            if ((votosPriCand > total) ||  (votosSegCand > total) || (votosTerCand > total)){
                System.out.print("Não haverá segundo turno.");
            }		else {
                System.out.print("Haverá segundo turno.");
            }
            input.close();
        }
    }
}

