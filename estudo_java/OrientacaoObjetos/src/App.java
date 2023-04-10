public class App
{
    public static void main(String[] args)
    {
        //Criando um novo objeto de usuairo
        User usuario = new User();

        usuario.nome = "Lucas";
        usuario.sobrenome = "Silveira Portal";

        System.out.println(usuario.nome);
        System.out.println( usuario.falar() );
        usuario.andar();
    }
}
