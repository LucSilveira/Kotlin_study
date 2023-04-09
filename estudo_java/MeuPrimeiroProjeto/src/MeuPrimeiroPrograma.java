public class MeuPrimeiroPrograma
{
    public static void main(String[] args)
    {
        System.out.println( MinhaNovaFuncao("lucao") );
        MaisUmaFuncao(22);
    }

    // Criando minha própria função
    static String MinhaNovaFuncao(String nome)
    {
        return "Hello World, bem vindo : " + nome;
    }

    // Criando uma nova função pra idade
    static void MaisUmaFuncao(int idade)
    {
        System.out.println("Você tem " + idade + " anos");
    }
}
