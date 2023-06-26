public class Exercicio39 {
    public static void main(String[] args) {
        System.out.println("String - Pratica 04: Intercalar letra de dois textos");

        String primeiroTexto = "java";
        String segundoTexto = "linguagem";

        String resultado = intercalarTextos(primeiroTexto, segundoTexto);

        System.out.println(resultado);
    }
    public static String intercalarTextos(String primeiroTexto, String segundoTexto) {
        StringBuilder resultado = new StringBuilder();

        int tamanhoMaximo = Math.max(primeiroTexto.length(), segundoTexto.length());

        for (int i = 0; i < tamanhoMaximo; i++) {
            if (i < primeiroTexto.length()) {
                    resultado.append(primeiroTexto.charAt(i));
                    resultado.append(" ");
                }
            if (i < segundoTexto.length()) {
                resultado.append(segundoTexto.charAt(i));
                resultado.append(" ");
            }
    }
    return resultado.toString();
}
}