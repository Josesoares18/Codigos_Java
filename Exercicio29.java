import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("String - Prática 01: Validar login e senha de usuário\n");

        System.out.print("\nDigite o login: ");
        String loginUsuario = input.nextLine();

        System.out.print("Digite a senha: ");
        String senhaUsuario = input.nextLine();

        if (validarRegistro(loginUsuario, senhaUsuario)) {
            System.out.println("\nRegistro aceito!");
        } else {
            System.out.println("\nRegistro não pode ser aceito. A senha não pode ser igual ao login.");
        }
        input.close();
    }

    public static boolean validarRegistro(String loginUsuario, String senhaUsuario) {
        return !loginUsuario.equals(senhaUsuario);
    }
}
