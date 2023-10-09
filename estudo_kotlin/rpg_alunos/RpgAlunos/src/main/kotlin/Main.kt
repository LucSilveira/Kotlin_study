import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {

    var random = kotlin.random.Random
    var terminal = Scanner(System.`in`)

    println("Bem-vindo ao sistema de jogo!")

    println("Escolha a classe do seu personagem")
    println("Mago, Guerreiro ou arqueira");

    var minhaEscolha = terminal.nextLine()
    var personagem = SelecionarPersonagem( minhaEscolha,  0)

    println("O seu personagem:")
    personagem.ApresentarPersonagem()


    var escolhaMaquina = random.nextInt(1, 3)
    var maquina = SelecionarPersonagem("", escolhaMaquina)

    println("O seu rival:")
    maquina.ApresentarPersonagem()

    //_____________________________________

    // Jogo
    while( personagem.pontosVida > 0 && maquina.pontosVida > 0 ){

        var acaoMaquina = random.nextInt(1, 2)

        println("\n\nInforme a ação desejada")
        println("1 - atacar, 2 - defender ");
        var resposta = terminal.nextLine().toInt()

        if( resposta == 1 && acaoMaquina == 1){
            var meuAtaque = personagem.Atacar()
            maquina.pontosVida = maquina.pontosVida - meuAtaque

            var maquinaAtaque = maquina.Atacar()
            personagem.pontosVida = personagem.pontosVida - maquinaAtaque

        }else{

            if( resposta == 2 && acaoMaquina == 1 ){
                personagem.Defender()

            }else if( resposta == 1 && acaoMaquina == 2 ){
                maquina.Defender()

            }else{
                println("Ninguém atacou")
            }
        }

        //
        println("\nOs seus pontos de vida ${personagem.pontosVida}, e os pontos de vida do rival ${maquina.pontosVida}")
    }
}

fun SelecionarPersonagem( minhaEscolha :String, escolhaMaquina : Int) : Personagem{

    var personagem = Personagem()

    if( minhaEscolha == "Mago" || escolhaMaquina == 1 ){

        personagem.nome = "O mago cinzento"
        personagem.classe = "Mago"
        personagem.pontosVida = 300

    }else if( minhaEscolha == "Guerreiro" || escolhaMaquina == 2 ){

        personagem.nome = "O guerreiro verde"
        personagem.classe = "Guerreiro"
        personagem.pontosVida = 500

    }else if( minhaEscolha == "Arqueira" || escolhaMaquina == 3 ){

        personagem.nome = "A arqueira lendária"
        personagem.classe = "Arqueira"
        personagem.pontosVida = 400
    }

    return personagem
}