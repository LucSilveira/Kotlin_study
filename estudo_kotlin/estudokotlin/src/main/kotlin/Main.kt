import org.jetbrains.annotations.Nullable

// Função de entrada da aplicação, que vai exexutar primeiro
fun main(args: Array<String>)
{
    println("Hello World!")

    // Definindo uma variável
    var nome = "Lucas"

    // Definindo uma constante ( uma váriavel imutável )
    val rg = "00.000.000-0"

    println(nome);

    // Consultando o tipo da variável
    println( nome::class );
    println("");

    // Definindo qual o tipo da nossa variável
    var sobrenome: String = "Silveira";
    var idade : Int = 22

   // _________________________________________________________________________________

    // Espaços de memória
    var texto : String
    var caracteres : Char = 'T' // Ocupa um totala de 16-bit
    var caracter = 'L' // Interpreta como um unico caracter usando ''
    var textoNovo = """
                        Esse é um exemplo de um bloco de texto meu caro $nome
                    """.trimIndent()

    var inteito : Int = 1; // Ocupa um total de 32-bits de memoria
    var binario : Byte = 8; // Ocupa um total de 8-bits de memoria
    var short : Short = 16; // Ocupa um total de 16-bits de memoria
    var lons : Long = 234567890L; // Ocupa um total de 64-bits de memoria
    var decimais : Double = 12.5 // Ocupa um total de 64-bits de memoria
    var flutuantes: Float = 40.5f // Ocupa um total de 32-bits de memoria
    var booleano : Boolean = true // Ocupa um total de 1-bit de memoria

    // _________________________________________________________________________________

    // Outros tipos
    var nulo = null

    //________________________________________________________________________________

    // Conversão de tipos
    var converterParaDouble = 32 // Inteiro
    var convertidoParaDouble = converterParaDouble.toDouble();

    println( convertidoParaDouble );

    // _______________________________________________________
    println("");

    // Criando condicionais com o kotlin
    var soma : Int = ( 34 + 20 );
    if( soma > 50 )
    {
        println( "Soma maior do que 50");

    }else{
        println("Soma menor do que 50");
    }

    println( "oi" == "oi" ?: "aquiii" );

    var soma02 : Int = ( 34 + 16 );
    var soma03 = null;
    var soma4 : Int? = null; // Permite receber nulos

    var resultado = soma03 ?: soma02; // Chado de operador elvis - Elvis presley
    println( resultado );

    var novoNome : String? = null;
    var tamanhoNovoNome = novoNome?.length // Verificando se o valor do nome existe para poder passar para variavel
    println( tamanhoNovoNome )

    //________________________________________________
    println("");

    // Criando uma função
    fun ExemploFuncao()
    {
        print("Isso é uma função")
    }
    ExemploFuncao()

    fun Somar(valorA : Int, valorB: Int) : Int
    {
        return valorA + valorB;
    }
    println( Somar(3, 4) )

    // ______________________________________________
    println("");

    // Exemplo de criação de um novo objeto com as chamadas de suas propriedades
    var usuarioExemplo = User(nome = "Lucas", sobrenome = "Silveira");

    println( usuarioExemplo.imprimirNomeCompleto() )
}