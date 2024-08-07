public class BancoTerminal {
    public static void main(String[] args) {
        // Primeiro caso
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        if (saldo > valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);

        // Segundo caso
        saldo = 15.0;
        valorSolicitado = 22.0;

        if (saldo > valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);
    }
}