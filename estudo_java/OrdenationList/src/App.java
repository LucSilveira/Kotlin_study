import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        List<String> nomes = new ArrayList<>();

        nomes.add("Nome 03");
        nomes.add("Nome 01");
        nomes.add("Nome 04");
        nomes.add("Nome 02");

        // Adicionando um novo elemento com

        System.out.println(Arrays.toString( nomes.toArray() ));

        // Ordenando a lista com os métodos do java
        Collections.sort( nomes );

        System.out.println(Arrays.toString( nomes.toArray() ));

        // Criando um foreach para percorrer esses elementos
        for( String nome : nomes )
        {
            System.out.println( nome );
        }
    }
}
