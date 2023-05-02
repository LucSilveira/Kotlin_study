import javax.xml.crypto.Data

fun main(args: Array<String>)
{
    var usuarioNovo = User("Lucas", 22);

    println( Database.name );

    // Atribuindo o usuario ao object Database
    Login( usuarioNovo );
    println( Database.userLogged?.ImprimirNome() );
}

// Criando uma função de login
fun Login( usuario : User )
{
    Database.userLogged = usuario;
}

// Criando um objeto de constantes para ser utilizado em todo o projeto de forma unica
// Por ser uma instância única viva
object Constantes
{
    // Aqui podemos definir nossas constantes
    const val MAX_LENGTH_NAME = 12;
}