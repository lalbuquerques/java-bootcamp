import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem vindo! Qual é o seu nome? ");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Digite o número da sua agência: ");
            String numAgencia = scanner.nextLine();
            
            System.out.println("Digite o número da sua conta: ");
            int numConta = scanner.nextInt();
            
            System.out.println("Qual o saldo da sua conta? ");
            double saldo = scanner.nextDouble();
            
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %,.2f já está disponível para saque.%n", nomeCliente, numAgencia, numConta, saldo);
        }
    }
}
