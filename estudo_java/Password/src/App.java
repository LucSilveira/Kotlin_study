import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String password = "123456";

        System.out.println( "Informe a sua senha" );
        Scanner scanner = new Scanner( System.in );
        String senha = scanner.nextLine();

        // Conferindo as senhas
        System.out.println( password.equals(senha) );
        System.out.println( password == senha );
    }
}
