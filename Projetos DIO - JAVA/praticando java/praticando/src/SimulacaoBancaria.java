import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Encerrar");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                  
                    System.out.println("Digite o valor do depósito R$");
                    Double deposito = scanner.nextDouble();
                    System.out.println("Seu saldo atual é de R$" + (saldo + deposito));
                    
                    break;
                    
                case 2:
                  
                    System.out.println("Digite o valor do saque");
                    Double saque = scanner.nextDouble();
                    
                    if (saque > saldo) {
                      System.out.println("Saldo insuficiente");
                      System.out.println(saldo);
                    }
                    else {
                      System.out.println("Saldo atual " + saldo);
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("Saldo atual " + saldo);
                    
                    break;
                    
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}