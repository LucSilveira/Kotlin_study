public class App
{
    public static void main(String[] args)
    {
        // Quando definimos uma clase ou função estática, dizemos que a classe compartilha das
        // mesmas informações com todo o sistema, no caso de uma variável ... todos os objetos
        // dessa classe, vão possuir o mesmo valor estático da váriavel por ela pertencer a classe

        Calculo calculo01 = new Calculo();
        Calculo calculo02 = new Calculo();

        // Criando um set estatico para que os objetos recebam os mesmos valores
        Calculo.setContagem(2);

        System.out.println( calculo01.getContagem() );
        System.out.println( calculo02.getContagem() );
    }
}
