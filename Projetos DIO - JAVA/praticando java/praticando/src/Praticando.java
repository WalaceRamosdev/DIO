import java.util.Locale;
import java.util.Scanner;

public class Praticando {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int saldoTotal = 2500;

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Agora, digite o número da sua agencia com 4 digitos: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite agora o número de sua conta com 3 digitos: ");
        int contaBanco = scanner.nextInt();

        System.out.println("Digite o valor do saque: R$ ");
        double saque = scanner.nextDouble();

        if (saque <= saldoTotal) {
            System.out.println("Saque autorizado. Obrigado pela preferência");
            System.out.println("Seu saldo atual é de: R$ " + (saldoTotal - saque));
        }
        
        else {
            System.out.println("Você não tem saldo suficiente para o saque.");
            System.out.println("Seu saldo atual é de: R$" + saldoTotal);
        }

        

        
    }
}
