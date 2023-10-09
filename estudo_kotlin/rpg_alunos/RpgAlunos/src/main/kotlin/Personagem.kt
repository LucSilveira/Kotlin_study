import kotlin.random.Random

class Personagem {
    // Caracteristicas
    var nome : String = ""
    var classe : String = ""
    var pontosVida : Int = 0;


    // Comportamentos
    fun ApresentarPersonagem(){
        println("""
            ${nome}
            Sua categoria é de ${classe}, e seus pontos de vida são de ${pontosVida}
        """.trimIndent())
    }

    fun Defender(){
        println( "O " + classe + " defendeu!" )
    }

    fun Atacar() : Int{

        var ataque = GerarDano()
        println("O ${classe} atacou! E causou um dano de ${ataque}")

        return ataque
    }

    // Função de gerar um dano de ataque
    fun GerarDano() : Int{
        var random = Random
        var ataque = random.nextInt(1, 100)

        return ataque
    }
}