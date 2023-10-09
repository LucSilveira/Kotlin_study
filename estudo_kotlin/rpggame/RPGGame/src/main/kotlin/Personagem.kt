import kotlin.random.Random

class Personagem
{
    var nome : String = ""
    var classe : String = ""
    var pontosVida : Int = 0

    fun Atacar() : Int{
        var ataque = GerarQuantidadeAtaque()

        println("O ${classe} atacou! E causou um dano de ${ataque}")

        return ataque;
    }

    fun Defender(){
        println("O ${classe} defendeu")
    }

    fun ApresentarEscolha(){
        println("""
            ${nome}.
            Sua categoria é ${classe}, e seus pontos de vida são de ${pontosVida}
        """.trimIndent())
    }

    fun GerarQuantidadeAtaque() : Int
    {
        var random = Random

        var ataque = random.nextInt(1, 100);

        return ataque
    }
}