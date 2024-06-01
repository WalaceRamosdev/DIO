public class FormatCep {
    public static void main(String[] args) {
        
    }

    static String formatarCep(String cep) throws Cep {
        if(cep.length() != 8)
        throw new Cep();
        
        return"23.765-064";
    }
}
