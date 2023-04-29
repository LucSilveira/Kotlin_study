package app.newbank;

import java.util.Scanner;

public class App
{
    // Obrigatório
    public static void main(String[] args)
    {
        // Criando uma nova conta para o usuário
        Conta novaConta = new Conta("0001", "1234", "Conta do usuario");

        // Criando o scanner para identificar qual a operação desejada pelo usuario
        System.out.println("Bem vindo ao NEW-BANK\nInforme qual o processo que deseja realizar:");
        System.out.println("1 - Depositar dinheiro, 2 - Sacar dinheiro, 3 - Consultar saldo, 0 - Sair");
        Scanner scanner = new Scanner( System.in );

        // Criando um laço para visualizar a resposta do usuárioo
        while ( true )
        {
            int resposta = scanner.nextInt();

            if( resposta == 0 )
            {
                break;

            }else if( resposta == 1 ){
                System.out.println("Informe o valor do deposito...");
                double valorDeposito = scanner.nextDouble();

                novaConta.Depositar( valorDeposito );

            }else if( resposta == 2 ){
                System.out.println("Informe o valor que deseja sacar...");
                double valorSaque = scanner.nextDouble();

                novaConta.SacarDinheiro( valorSaque );

            }else if( resposta == 3 ) {
                novaConta.ConsultarSaldo();

            }else{
                break;
            }

            System.out.println("\nInforme qual o processo que deseja realizar:");
            System.out.println("1 - Depositar dinheiro, 2 - Sacar dinheiro, 3 - Consultar saldo, 0 - Sair");
        }
    }
}
