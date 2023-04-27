public class App
{
    public static void main(String[] args)
    {
        Arrays[] arrayNovo = new Arrays[10];

        for (int i = 0; i < arrayNovo.length; i++)
        {
            // Criando um novo objeto array para salvar na lista
            Arrays novoArray = new Arrays();
            novoArray.valorArray = i;

            arrayNovo[i] = novoArray;
            System.out.println(arrayNovo[i].valorArray);
        }

        // System.out.println(arrayNovo[3].valorArray);
    }
}
