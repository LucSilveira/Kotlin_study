class User
{
    private var nome : String;
    private var idade : Int;

    constructor(nome : String, idade: Int)
    {
        this.nome = VerificarLimiteNome( nome );
        this.idade = idade;
    }

        companion object
        {
            // private const val MAX_LENGTH_NAME = 12; -- Usando no arquivo main no nosso object

            fun VerificarLimiteNome(nome : String) : String
            {
                if( nome.length > Constantes.MAX_LENGTH_NAME )
                {
                    return nome.substring(0, Constantes.MAX_LENGTH_NAME);

                }else{
                    return nome;
                }
            }
        }

    // Função para devolver o nome
    fun ImprimirNome() : String
    {
        return this.nome;
    }
}