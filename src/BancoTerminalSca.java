import java.util.Scanner;

public class BancoTerminalSca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saldo inicial
        double saldo = 25.0;

        // Loop para permitir múltiplas operações de saque
        while (true) {
            // Solicita ao usuário o valor do saque
            System.out.print("Digite o valor solicitado para saque (ou 0 para sair): ");
            double valorSolicitado = scanner.nextDouble();

            // Verifica se o usuário quer sair
            if (valorSolicitado == 0) {
                break;
            }

            // Verifica se o saldo é suficiente para realizar o saque
            if (saldo >= valorSolicitado) {
                saldo -= valorSolicitado;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente");
            }

            // Imprime o valor do saldo atual
            System.out.println("Saldo atual: " + saldo);
        }

        // Fecha 
        scanner.close();
    }
}