public class App
{
    public static void main(String[] args)
    {
        String x = "Olá mundo";

        System.out.println( x.length() );
        System.out.println( x + " novo texto" );
        System.out.println( x.contains("Olá") );
        System.out.println( x.indexOf("mundo") );
        System.out.println( x.lastIndexOf("mundo") );
        System.out.println( x.toLowerCase() );
        System.out.println( x.toUpperCase() );
        System.out.println( x.trim() );
        System.out.println( x.substring(3) );
        System.out.println( x.equals("Ola") );
    }
}
