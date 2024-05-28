import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;

        //Exibir as mensagens para o nosso usuário

        System.out.println("Por favor digite número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite numero da agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        //imprimindo os dados obtidos pelo usuario

        System.out.println("Numero da conta:" + numero);
        System.out.println("Numero da agencia: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);

        //Obter pela scanner os valores digitados no terminal

        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" +saldo + " já está disponível para saque");

        }
    }

        
               

