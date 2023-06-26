public class Exercicio44 {
    public static void main(String[] args) {
        int[] vetor = {8, 17, 25, 50, 14, 19, 28, 77, 85, 45};

        System.out.println("Questão 02: Manipulação de elementos do vetor\n");

        // a) Valores armazenados nas posições pares
        System.out.print("a) Valores armazenados nas posições pares: ");
        for (int i = 0; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // b) Valores pares
        System.out.print("b) Valores pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        // c) Valores armazenados das posições 9 a 0
        System.out.print("c) Valores armazenados das posições 9 a 0: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // d) Valores armazenados das posições 4 a 8
        System.out.print("d) Valores armazenados das posições 4 a 8: ");
        for (int i = 4; i <= 8; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // e) Até que os elementos estejam em ordem crescente
        System.out.print("e) Até que os elementos estejam em ordem crescente: ");
        boolean ordenado = false;
        while (!ordenado) {
            ordenado = true;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    ordenado = false;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // f) Apenas os elementos que estão na ordem crescente
        System.out.print("f) Apenas os elementos que estão na ordem crescente: ");
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] <= vetor[i + 1]) {
                System.out.print(vetor[i] + " ");
            } else {
                break;
            }
        }
        System.out.println(vetor[vetor.length - 1]);

        // g) A partir da última posição, apenas os elementos que estão na ordem decrescente
        System.out.print("g) A partir da última posição, apenas os elementos que estão na ordem decrescente: ");
        for (int i = vetor.length - 1; i > 0; i--) {
            if (vetor[i] >= vetor[i - 1]) {
                System.out.print(vetor[i] + " ");
            } else {
                break;
            }
        }
       
        // h) Os elementos das posições 0 a 9, intercalados com elementos das posições 9 a 0
        System.out.print("h) Os elementos das posições 0 a 9, intercalados com elementos das posições 9 a 0: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " " + vetor[vetor.length - 1 - i] + " ");
        }
        System.out.println();

        // i) Considerar o array dividido em duas partes e mostrar os elementos das duas partes intercalados
        System.out.print("i) Considerar o array dividido em duas partes e mostrar os elementos das duas partes intercalados: ");
        int meio = vetor.length / 2;
        for (int i = 0; i < meio; i++) {
            System.out.print(vetor[i] + " " + vetor[meio + i] + " ");
        }
        System.out.println();

        // j) Desafio: os valores em ordem crescente, sem ordenar o array
        System.out.print("j) Os valores em ordem crescente, sem ordenar o array: ");
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

}
