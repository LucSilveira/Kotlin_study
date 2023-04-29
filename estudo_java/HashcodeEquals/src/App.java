public class App
{
    public static void main(String[] args)
    {
        User usuarioA = new User("Lucas", "Siveira");
        User usuarioB = new User("Lucas", "Siveira");

        System.out.println( usuarioA );
        System.out.println( usuarioA.hashCode() );

        System.out.println( usuarioB );
        System.out.println( usuarioB.hashCode() );

        System.out.println( usuarioA.equals( usuarioB ) );

        // Detalhe, antes da modificação dos elementos para comparar os valores
        // e não os espaços de memória, as variáveis são diferentes
    }
}
