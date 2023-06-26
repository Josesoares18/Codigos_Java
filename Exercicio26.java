import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String loginCorreto = "login123" ;
        String senhaCorreta = "senha123" ; 
        
        System.out.print("String - Prática 01: Validar login e senha de usuário\n");

        System.out.print("\nDigite o login de usuário: ");
        String loginUsuario = input.nextLine();

        System.out.print("Digite a senha de usuário: ");
        String senhaUsuario = input.nextLine();

        if (loginUsuario.equals(loginCorreto) && (senhaUsuario.equals(senhaCorreta))) {
            System.out.print("\nLogin bem-sucedido!");
        }   
        else if (loginUsuario == senhaUsuario){
            System.out.print("\nOs dois estão iguais. Digite novamente.");
        }
        else {
            System.out.print("Login ou usuario errado. Tente novamente.");
        }
        
        input.close();
    }
}