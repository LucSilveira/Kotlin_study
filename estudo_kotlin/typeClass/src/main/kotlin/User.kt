class User
{
    var nome : String?
    var idade : Int;

    constructor(nome : String, idade : Int)
    {
        this.nome = nome;
        this.idade = idade;

        // Criando uma propriedade que não precisa ser declarada ou utilizada no momento da criação
        // do tipo lateinit - 'inicializar mais tarde'
        // lateinit var estadoCivil : String;
    }

    // Criando uma função para devolução padrão de usuario
    fun output()
    {
        println("Meu nome é $nome")
    }
}