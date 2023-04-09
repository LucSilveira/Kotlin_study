import java.util.Scanner;

public class Usuario
{
    public static void main(String[] args)
    {
        // Criando a recepcao de comandos via terminal
        Scanner scanner = new Scanner( System.in );

        System.out.println("Informe o seu nome :");

        String nome = scanner.nextLine();

        System.out.println("Bem vindo: " + nome);
    }
}
