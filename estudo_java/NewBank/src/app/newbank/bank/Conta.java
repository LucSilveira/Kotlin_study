package app.newbank.bank;

public class Conta
{
    private String agencia;
    private String conta;
    private String nome;
    private Double valorDaConta;

    // Criando a definição do tamanho do nome - 12 caracteres
    private static final int MAX_LENGTH = 12;

    // Criando um construtor para criar os objetos da classe Conta
    public Conta(String agencia, String conta, String nome)
    {
        this.agencia = agencia;
        this.conta = conta;
        this.valorDaConta = 0.00;

        // Chamar a função para verificar as condições do nome informado
        setNome( nome );
    }

    // Função para delimitar o tamanho do nome
    public void setNome(String nome)
    {
        // Verificando a quantidade de caracteres
        if( nome.length() > MAX_LENGTH )
        {
            this.nome = ( nome.substring( 0, 9 ) + "...");

        }else{
            this.nome = nome;
        }
    }

    // Função para sacar o dinheiro da conta
    public void SacarDinheiro( double valorDoSaque )
    {
        if( this.valorDaConta > valorDoSaque )
        {
            this.valorDaConta = valorDaConta - valorDoSaque;

            System.out.println( "O valor do saque foi de : R$" + valorDoSaque + ", e sobrou um total de : R$" + valorDaConta + " em sua conta!" );

        }else{
            System.out.println("O valor disponível em sua conta, não é suficiente para realizar o saque!");
        }
    }

    // Função para realizar o deposito
    public void Depositar( double valorDoDeposito )
    {
        this.valorDaConta += valorDoDeposito;

        System.out.println("Deposito de : R$" + valorDoDeposito + " realizado com sucesso");
    }

    public void ConsultarSaldo()
    {
        System.out.println("Seu saldo atual é de R$:" + this.valorDaConta);
    }
}
