public class Calculo
{
    private static int contagem;

    public static void setContagem(int contagem)
    {
        // Sumimos com o this, pq ele n referencia mais o objeto, mas sim a classe
        Calculo.contagem += contagem;
    }

    public static int getContagem()
    {
        return contagem;
    }
}
