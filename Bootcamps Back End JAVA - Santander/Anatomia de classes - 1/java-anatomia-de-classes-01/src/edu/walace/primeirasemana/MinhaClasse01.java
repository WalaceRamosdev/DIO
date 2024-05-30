package edu.walace.primeirasemana;
public class MinhaClasse01 {
    public static void main (String [] args ) {
        String primeiroNome = "Walace";
        String segundoNome = "Ramos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return"Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
