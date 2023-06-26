public class Exercicio43 {
    public static void main(String[] args) {
        int[] hodometro = {89400, 89800, 99100, 99500, 900, 1500, 2100, 2200};

        System.out.println("Questão 01: Hodômetro\n");
        
        System.out.println("A quantidade de quilometros percorridos em cada dia da semana: \n");
        System.out.printf("Segunda: " + hodometro[1] + ", Terça: " + hodometro[2] + ", Quarta: " + hodometro[3] + ", Quinta: " + hodometro[4] + 
        ", Sexta: " + hodometro[5] + ", Sabado: " + hodometro[6] + ", Domingo: " + hodometro[7] + "\n");

        System.out.println("\nA media dos quilometros percorridos: \n");
        int soma = 0;
        for (int i = 0; i < hodometro.length; i++) {
            soma += hodometro[i];
        }
        int media = (int) soma / (int) hodometro.length;

        System.out.println("A media dos quilometros percorridos é: " + media);

        System.out.println("\nOs dias da semana em que foi percorrido quilometros acima da media: \n");

        for (int i = 0; i < hodometro.length; i++) {
            if (hodometro[i] > media) {
                System.out.printf("Dia da semana: " + (i + 1) + ", quilometros acima da media: " + hodometro[i] + "\n");
                }
            }
        }
}