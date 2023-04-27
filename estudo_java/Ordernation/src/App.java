import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        int[] numeros = new int[]{10, 3, 4, 6, 9, 2, 5, 1, 7, 8, 0, 10};

        // Ordenando pelo método padrão do java .sort()
        Arrays.sort( numeros );

        System.out.println(numeros);

        System.out.println( Arrays.toString(numeros) );
    }
}
