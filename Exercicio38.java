public class Exercicio38 {
    public static void main(String[] args) {
        System.out.println("Vetor - Pratica 01: Validar logins\n");

        String[] logins = { "usuario1", "login2", "3login", "login4", "usuário5" };

        for (int i = 0; i < logins.length; i++) {
            String login = logins[i];
            boolean loginCorreto = verificarLogin(login);
            String status = loginCorreto ? "correto" : "errado";
            System.out.println("O login " + login + " está " + status + ".");
        }
    }

    public static boolean verificarLogin(String login) {
        for (int i = 0; i < login.length(); i++) {
            char c = login.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
