package banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e captura o número da conta
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        // Solicita e captura o número da agência
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        // Consome a quebra de linha pendente antes de capturar o nome do titular
        System.out.println("Por favor, digite o nome do titular da conta: ");
        scanner.nextLine();
        String titular = scanner.nextLine();

        // Solicita e captura o saldo da conta
        System.out.println("Por favor, digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        // Exibe a mensagem de confirmação com os dados da conta
        System.out.println("Olá "+
                    titular+", obrigado por criar uma conta em nosso banco, sua agência é "+
                    agencia+", conta "+
                    numeroConta+" e seu saldo "+
                    saldo+" já está disponível para saque");

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
