import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Math - Prática 03: Distância entre dois pontos (plano tridimensional)\n");

        System.out.println("Digite os coordenadas do ponto 1: ");
        System.out.print("\nCoordenada (P1) x: ");
        double primCordX = ler.nextDouble();
        System.out.print("Coordenada (P1) y: ");
        double primCordY = ler.nextDouble();
        System.out.print("Coordenada (P1) z: ");
        double primCordZ = ler.nextDouble();

        System.out.println("\nDigite os coordenadas do ponto 2: ");
        System.out.print("\nCoordenada (P2) x: ");
        double segCordX = ler.nextDouble();
        System.out.print("Coordenada (P2) y: ");
        double segCordY = ler.nextDouble();
        System.out.print("Coordenada (P2) z: ");
        double segCordZ = ler.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(segCordX - primCordX, 2) + Math.pow(segCordY, primCordY) + Math.pow(segCordZ, primCordZ));
        System.out.println("\nA distancia entre os pontos é: " + distancia);

        ler.close();
    }
}
