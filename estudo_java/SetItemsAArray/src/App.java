import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        String[] nomes = new String[10];

        System.out.println( Arrays.toString(nomes) );

        // Preenchendo os items da lista com um valor padrão
        Arrays.fill(nomes, "Desconhecido");
        System.out.println( Arrays.toString(nomes) );
    }
}
