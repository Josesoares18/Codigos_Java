public class Exercicio48 {
    public static void main(String[] args) {
        int variavelUm = 10;
        int variavelDois = 1;

        boolean primeiraVariavelEMaiorQueASegunda = variavelUm > variavelDois;
        System.out.println("Primeira variável é maior que a segunda? " + primeiraVariavelEMaiorQueASegunda);

        boolean primeiraVariavelEMenorQueASegunda = variavelUm < variavelDois;
        System.out.println("Primeira variável é menor que a segunda? " + primeiraVariavelEMenorQueASegunda);

        boolean primeiraVariavelEMaiorouIgualQueASegunda = variavelUm >= variavelDois;
        System.out.println("Primeira variável é maior ou igual a segunda? " + primeiraVariavelEMaiorouIgualQueASegunda);

        boolean primeiraVariavelEMenorouIgualQueASegunda = variavelUm <= variavelDois;
        System.out.println("Primeira variável é menor ou igual a segunda? " + primeiraVariavelEMenorouIgualQueASegunda);
        
        boolean primeiraVariavelEIgualQueASegunda = variavelUm == variavelDois;
        System.out.println("Primeira variável é igual a segunda? " + primeiraVariavelEIgualQueASegunda);

        boolean primeiraVariavelEDiferenteQueASegunda = variavelUm != variavelDois;
        System.out.println("Primeira variável é diferente da segunda? " + primeiraVariavelEDiferenteQueASegunda);
    }
}
