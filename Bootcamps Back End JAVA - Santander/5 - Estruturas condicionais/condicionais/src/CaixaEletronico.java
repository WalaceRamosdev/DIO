public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("Seu saldo atual é: " + saldo);
    }
        else 
        System.out.println("Você não tem saldo suficiente.");

        
    }
}
