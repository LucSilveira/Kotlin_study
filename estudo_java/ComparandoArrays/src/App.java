import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        int[] numerosA = new int[]{1, 2, 3};
        int[] numerosB = new int[]{1, 2, 3};

        System.out.println( numerosA == numerosB );
        System.out.println( numerosA.equals(numerosB) );
        System.out.println( Arrays.equals(numerosA, numerosB) );

    }
}
