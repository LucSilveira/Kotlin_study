package app.newbank;

import java.util.ArrayList;
import java.util.List;

public class Banco
{
    private String agencia;
    private List<Conta> contas;
    private int ultimaConta = 1;

    // Criando um construtor para a nossa classe
    public Banco(String agencia)
    {
        this.agencia = agencia;
        this.contas = new ArrayList<>();
    }

    public void InserirConta(Conta conta)
    {
        contas.add( conta );
    }

    // Criando as contas dos usuários
    public Conta CriarNovaConta( String nome )
    {
        Conta novaConta = new Conta(this.agencia, ("0000" + ultimaConta), nome);

        ultimaConta++;
        return novaConta;
    }

    public void TotalNoBanco()
    {
        double total = 0;

        for (Conta conta : contas)
        {
            total += conta.getValorDaConta();
        }

        System.out.println( "O banco possui ao todo R$" + total );
    }
}
