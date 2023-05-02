
// Usando o object que seria apenas uma instância unica para todo o projeto
// e não é preciso instânciar novas vezes como as classes para acessar suas
// proriedades
object Database
{
    var name : String = "Desconhecido";
    var userLogged: User? = null;
}