class User
{
    var nome : String = "";
    var sobrenome : String = "";

    // Deifinindo propriedades e métodos que serão anexados a classe
    companion object
    {
        // const - tempo de compilação
        private const val MAX_LENGHT : Int = 6;

        fun LimitarNomeUsuario(nome : String) : String
        {
            if( nome.length > MAX_LENGHT)
            {
                return nome.substring(0, MAX_LENGHT);

            }else{
                return nome
            }
        }
    }

    public constructor(nome : String, sobrenome: String)
    {
        this.nome = LimitarNomeUsuario( nome );
        this.sobrenome = sobrenome
    }

    fun imprimirNomeCompleto(): String
    {
        return "$nome $sobrenome";
    }
}