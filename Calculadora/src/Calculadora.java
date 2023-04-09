public class Calculadora
{
    public static void main(String[] args)
    {
        // Convertendo as váriaveis para realizar as contass
        int x = Integer.parseInt( args[1] );
        int y = Integer.parseInt( args[2] );

        // Interpretando qual função deverá ser chamada
        if( args[0].equals("soma") || args[0].equals("somar") )
        {
            System.out.println( Soma(x, y) );
        }else if( args[0].equals("subtrair") || args[0].equals("subtrai") ){

            System.out.println( Subtrair(x, y) );
        }else if( args[0].equals("dividir") || args[0].equals("divide") ){

            System.out.println( Dividir(x, y) );
        }else if( args[0].equals("multiplica") || args[0].equals("multiplicar") ){

            System.out.println( Multiplicar(x, y) );

        }else{
            System.out.println("Função não definida");
        }
    }

    // Criando função para realizar minhas operações matemática
    static int Soma(int x, int y)
    {
        return x + y;
    }

    static int Subtrair(int x, int y)
    {
        return x - y;
    }

    static int Dividir(int x, int y)
    {
        return x / y;
    }

    static int Multiplicar(int x, int y)
    {
        return x * y;
    }
}
