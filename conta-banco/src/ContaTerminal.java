import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: cONHECER E IMPORTAR A CLASSE SCANNER

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("\t\t\t\t\t\t\tSeu Banco Virtual");
        System.out.println("\t\t\t\t\t\tInforme seus dados para o Cadastro");        

        System.out.println("Informe o nome do cliente ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe sua agência");
        String agencia = scanner.next();
        
        System.out.println("Informe sua conta com 4(quatro) digitos ");
        int conta = scanner.nextInt();
        String contaFormatada = String.format("%03d-%d", conta / 10, conta % 10);

        System.out.println("Informe Saldo ");
        double saldo = scanner.nextDouble();

        //Obter pela scanner os valores digitados no terminal

        System.out.println("Cadastrado em nome do Cliente " + nomeCliente );
        System.out.println("Sua agência é " + agencia + " Sua conta é " + contaFormatada ); //        System.out.println(" - " + contaFormatada);       
        System.out.println("Seu Saldo é " + saldo);        
    }
}