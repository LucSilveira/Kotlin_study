public class User
{
    // Definindo o objeto de usuário
    public String nome;
    public String sobrenome;
    private boolean estadoLogado;

    // Criando as ações dos usuários
    public String falar()
    {
        return "Oi, tudo bem?";
    }

    public void andar()
    {
        System.out.println("Oi, estou andando");
    }

    public void logarUsuario(boolean logado)
    {
        estadoLogado = logado;
    }
}
