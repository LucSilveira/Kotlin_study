
import java.util.Scanner
import kotlin.random.Random

fun main(args: Array<String>) {

    var terminal = Scanner( System.`in` )
    println("Bem vindo ao sistema de jogo rpg!\n\n")

    println("Informe a classe de personagem desejada :")
    println("Mago, Guerreiro ou Arqueiro");
    var personagem = SelecionarPersonagem( (terminal.nextLine().toString()), 0 )

    println("\nO seu personagem é")
    personagem.ApresentarEscolha()

    // Gerando o rival
    var random = Random
    var maquina = SelecionarPersonagem( "", random.nextInt(1, 3) )

    println("\nO seu rival é")
    maquina.ApresentarEscolha()

    println("\n\nDeseja iniciar o jogo?")
    var resposta = terminal.nextLine()

    // Jogo
    while ( personagem.pontosVida > 0 || maquina.pontosVida < 0 ){

        // Acao da maquina
        var acaoMaquina = random.nextInt(1, 2)

        println("\n\nInforme a ação")
        println("1 - Atacar, 2 - Defender")
        var acao = terminal.nextLine().toInt()

        if( acao == 1 && acaoMaquina == 1 ){
            var seuAtaque = personagem.Atacar()
            maquina.pontosVida -= seuAtaque

            var ataqueMaquina = maquina.Atacar()
            personagem.pontosVida -= ataqueMaquina

        }else{

            if( acao == 2 && acaoMaquina == 1 ){
                personagem.Defender()

            }else if( acao == 1 && acaoMaquina == 2){
                maquina.Defender()

            }else{
                println("Ninguém atacou")
            }
        }

        // Verificando as vidas
        if( personagem.pontosVida <= 0 && maquina.pontosVida > 0 ) {
            println("\n\nGame Over")

        }else if(personagem.pontosVida > 0 && maquina.pontosVida <= 0){
            println("\n\nYou Win")

        }else{
            println("\nOs seus pontos de vida são ${personagem.pontosVida} \n e do seu rival ${maquina.pontosVida}")
        }
    }
}

fun SelecionarPersonagem( escolha :String, opcao : Int) : Personagem {

    var personagem = Personagem()

    if( escolha.toLowerCase() == "mago" || opcao == 1 )
    {
        personagem.nome = "O mago cinzento"
        personagem.classe = "Mago"
        personagem.pontosVida = 300

    }else if( escolha.toLowerCase() == "guerreiro" || opcao == 2 ){

        personagem.nome = "O Guerreiro lendário"
        personagem.classe = "Guerreiro"
        personagem.pontosVida = 500

    }else if( escolha.toLowerCase() == "arqueiro" || opcao == 3 ){

        personagem.nome = "O arqueiro infálivel"
        personagem.classe = "Arqueiro"
        personagem.pontosVida = 400
    }

    return personagem
}