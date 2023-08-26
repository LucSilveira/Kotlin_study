class User : UserInterface
{
    var nome : String;
    var idade : Int;

    constructor( nome : String, idade : Int )
    {
        this.nome = nome;
        this.idade = idade;
    }

    // Criando a função para devolver os dados do usuário
    fun ChamarUsuario() : String
    {
        return "$nome, possui $idade anos";
    }

//    Chamando as funções em relação ao usuario
    override fun Correr() // override - se referencia as funções usadas na interface para a sobrescrever
    {
        // Definindo o comportamento da função
    }

    override fun Falar() {
        // Definindo o comportamento da função
    }
}