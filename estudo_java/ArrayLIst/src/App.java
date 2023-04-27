import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        List<String> nomes = new ArrayList<>();

        //Adicionando elementos no array
        nomes.add("Nome 01");
        nomes.add("Nome 02");

        for (int i = 0; i < nomes.size(); i++ )
        {
            System.out.println( nomes.get(i) );
        }

        //Procurando um indice de um elemento específico
        int indexProcurado = nomes.indexOf("Nome 02");
        System.out.println( indexProcurado );

        //Verificando se a lista é vázia
        System.out.println( nomes.isEmpty() );

        // Verificando se existe algum elemento na lista com a propriedade informada
        System.out.println( nomes.contains("Nome 02") );
        System.out.println( nomes.contains("Nome 20") );

        // Verificar o tamanho da lista
        System.out.println( nomes.size() );

        // Limpar a lista
        nomes.clear();
        System.out.println( Arrays.toString(nomes.toArray()) );
    }
}
