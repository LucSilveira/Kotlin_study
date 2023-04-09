import java.util.Random;

public class MegaSena
{
    public static void main(String[] args)
    {
        // Crianado uma váriavel randomica
        Random randomico = new Random();

        int i = 0;
        while( i < 6 )
        {
            int numeroGerado = randomico.nextInt(60);
            System.out.println( numeroGerado );

            // Somando a variável i
            i++;
        }

        System.out.println("______________________________");

        for (int y = 0; y < 6; y++)
        {
            int numeroGerado = randomico.nextInt(60);
            System.out.println( numeroGerado );
        }

        System.out.println( "____________________________________" );

        int z = 0;
        do
        {
            int numeroGerado = randomico.nextInt(60);
            System.out.println( numeroGerado );

            z++;
        }while( z < 6);
    }
}
