package app.newbank;

import java.util.Scanner;

public class App
{
    // Obrigatório
    public static void main(String[] args)
    {
        Scanner scannerAcaoConta = new Scanner( System.in );

        // Criando uma instância da classe Banco
        Banco banco = new Banco("001");

        System.out.println("Bem vindo ao NEW-BANK\n");
        while ( true )
        {
            System.out.println("Informe qual o processo que deseja realizar:");
            System.out.println("1 - Criar conta, 0 - Sair");
            int respostaConta = scannerAcaoConta.nextInt();

            if( respostaConta == 1 )
            {
                Scanner scannerConta = new Scanner( System.in );

                System.out.println("Por gentileza informar seu nome:");
                String nomeUsuario = scannerConta.nextLine();

                // Criando a conta do usuário pelo nome informado
                Conta contaUsuario = banco.CriarNovaConta( nomeUsuario );
                banco.InserirConta( contaUsuario );

                // Chamando a operacao da conta
                OperacaoBancaria( contaUsuario );
            }else{
                break;
            }
        }

        banco.TotalNoBanco();
    }

    static void OperacaoBancaria(Conta conta)
    {
        // Criando o scanner para identificar qual a operação desejada pelo usuario
        System.out.println("\nInforme qual o processo que deseja realizar:");
        System.out.println("1 - Depositar dinheiro, 2 - Sacar dinheiro, 3 - Consultar saldo, 0 - Sair");
        Scanner scanner = new Scanner( System.in );

        // Criando um laço para visualizar a resposta do usuárioo
        while ( true )
        {
            int resposta = scanner.nextInt();

            if( resposta == 1 )
            {
                System.out.println("Informe o valor do deposito...");
                double valorDeposito = scanner.nextDouble();

                conta.Depositar( valorDeposito );

            }else if( resposta == 2 ){
                System.out.println("Informe o valor que deseja sacar...");
                double valorSaque = scanner.nextDouble();

                conta.SacarDinheiro( valorSaque );

            }else if( resposta == 3 ) {
                conta.ConsultarSaldo();

            }else{
                break;
            }

            System.out.println("\nInforme qual o processo que deseja realizar:");
            System.out.println("1 - Depositar dinheiro, 2 - Sacar dinheiro, 3 - Consultar saldo, 0 - Sair");
        }

        System.out.println( conta );
    }
}
