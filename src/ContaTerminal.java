import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * Esse método simula a criação de uma conta bancária ao ser executado,
     * coletando informações do usuário via terminal/console e,
     * ao final, exibe uma mensagem de boas-vindas.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem-vindo!");
        
        System.out.println("Por favor, informe seu primeiro nome:");
        String nome = scanner.next();
        
        System.out.println("Qual o número da agência de sua preferência?");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, informe um número para sua conta:");
        String numeroConta = scanner.next();

        System.out.println("Qual o saldo inicial da sua conta?");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco! "
            + "Sua agência é a " + numeroAgencia 
            + ", conta corrente " + numeroConta 
            + ", seu saldo é de R$ " + saldo 
            + " e já está disponível para saque!");
    }
}
