import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero; //número da conta
        String agencia; //código da agência
        String nomeCliente; //nome do cliente
        double saldo; //saldo da conta

        System.out.println("Por favor, digite seu nome completo:");
        nomeCliente = teclado.nextLine();
        
        System.out.println("Por favor, digite o código da agência:");
        agencia = teclado.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        numero = teclado.nextInt();

        System.out.println("Por favor, informe seu saldo, usando vírgula como separador:");
        saldo = teclado.nextDouble();

        String saldoFormatado = String.format("%.2f", saldo);

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia+ ", conta " + numero + " e seu saldo R$ " + saldoFormatado + " já está disponível para saque");

       


    }
}
