package app.newbank.bank;

public class App
{
    // Obrigatório
    public static void main(String[] args)
    {
        /* Definições das regras do NewBank
        *
        * - Sistema de contas que vão possuir os seguintes atributos ( Agencia, Conta, Nome - [ 12 caracteres ] )
        *   e vai possuir as seguintes funções ( saque, deposito, consultaDetalhada )
        * */

        // Criando uma nova conta
        Conta novaConta = new Conta("001", "12345", "Lucas Silveira");

        novaConta.SacarDinheiro( 300.00 );

        novaConta.Depositar( 400.00 );

        novaConta.SacarDinheiro( 300.00 );

        novaConta.ConsultarSaldo();
    }
}
