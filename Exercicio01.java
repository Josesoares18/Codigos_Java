/*Exercio - Area do Objeto*/

import java.util.Scanner;
public class Exercicio01
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculo da area do objeto.");
        System.out.println(" ");
        //Atribuindo valor
        final double valorDePi = 3.14;
        System.out.print("Digite o valor do raio: ");
        double raioDoCirculo = input.nextDouble();
        
        System.out.print("Digite o valor do lado: ");
        double ladoDoQuadrado = input.nextDouble();
        System.out.println(" ");
        
        //Resultado
        double areaDoCirculo = valorDePi * raioDoCirculo * raioDoCirculo / 2;
        double areaDoQuadrado = ladoDoQuadrado * ladoDoQuadrado;
        double resultado = areaDoCirculo + areaDoQuadrado;
        System.out.print("O resultado da area do objeto é igual a: " + resultado);
        input.close();
    }
}