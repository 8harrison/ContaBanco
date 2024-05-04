import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        println("Por favor, digite o número da sua conta.");
        int numConta = scanner.nextInt();

        println("Por favor digite o número da sua agência.");
        String numAgencia = scanner.next();

        println("Por favor, digite o seu nome.");
        String nome = scanner.next();

        println("Por favor, digite o seu sobrenome.");
        String sobrenome = scanner.next();

        println("Por favor, digite o seu saldo.");
        double saldo = scanner.nextDouble();

        println(("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque.").formatted(nome, sobrenome, numAgencia, numConta, saldo));

    }

    public static void println(Object msg) {
        System.out.println(msg);
    }
}