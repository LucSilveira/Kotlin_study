public class App
{
    public static void main(String[] args)
    {
        User usuarioUm = new User("Lucas", "Silveira");

        System.out.println( usuarioUm.concatenarNomes() );
        System.out.println( usuarioUm.concatenarNomes(true) );
    }
}
