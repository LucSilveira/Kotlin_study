fun main(args: Array<String>)
{
    // Criando um novo usuário
    var novoUsuario = User("Lucas", 22);

    // Condição por meio de IF
    if( novoUsuario.nome == "Lucas" )
    {
        println(" Oi, tudo bem Lucas? ");
    }else{
        println("Desculpe, mas não te reconheço.");
    }

    // Condição por meio do WHEN
    when( novoUsuario.nome )
    {
        "Lucas" -> {
            println(" Oi, tudo bem Lucas? ");
        }
        else -> {
            println("Desculpe, mas não te reconheço.");
        }
    }

    // Estrutura do WHEN com condições internas
    when
    {
        novoUsuario.nome == "Lucas" -> {
            println(" Oi, tudo bem Lucas? ");
        }

        else -> println("Desculpe, mas não te reconheço.");
    }

    // ______________________________________________________

    // Armazenando variavéis retornando mediante as condições
    var resultadoTeste = if( novoUsuario.nome == "Lucas" )
                        {
                            "é o lucas";
                        }else{
                            "não é o lucas"
                        }

    var resultadoTeste02 = when( novoUsuario.nome )
                            {
                                "Lucas" -> {
                                    println(" Oi, tudo bem Lucas? ");
                                }
                                else -> {
                                    println("Desculpe, mas não te reconheço.");
                                }
                            }
}

// Criando classe enumerada de cartão de crédito
enum class CreditCard( val label : String )
{
    VISA ( "Visa" ),
    MASTER ("Mastercard"),
    ELO ( "Elo")
}