import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        int[] dia = new int[7]; // Declaração e criação do array com tamanho 7

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 7; i++) { // Índice começa em 0 e vai até 6
            dia[i] = ler.nextInt();
        }

        // Imprimir os valores armazenados no array "dia"
        for (int i = 0; i < 7; i++) {
            System.out.println("Dia " + (i + 1) + ": " + dia[i]);
        }
        
        ler.close();
    }
}
