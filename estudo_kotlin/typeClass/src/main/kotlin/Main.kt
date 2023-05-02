fun main(args: Array<String>) {

    // Chamando o exemplo de classes alinhadas
    var exemplo01 = ClasseExemplo01()
    exemplo01.ChamadaExemplo01();

    var exemplo02 = ClasseExemplo01.ClasseExemplo02();
    exemplo02.ChamadaExemplo02();

    println();

    // Chamando o exemplo de classes internas
    var exemplo03 = ClasseExemplo03();
    exemplo03.ChamadaExemplo03();

    var exemplo04 = exemplo03.ClasseExemplo04();
    exemplo04.ChamadaExemplo04()

    println();

    // Chamando o exemplo de classes enumeradas
    println( ClasseExemplo05.ExemploEnum01 );

    var exemplo06 = ClasseExemplo06.ExemploValorEnum
    println( exemplo06.exemploDadosEnum );
}

/* CRIANDO ALGUNS EXEMPLOS DE USOS DE CLASSES */

// Classes alinhadas - Nested Class
class ClasseExemplo01
{
    fun ChamadaExemplo01()
    {
        println(" Exemplo da primeira classe ");
    }

    class ClasseExemplo02
    {
        fun ChamadaExemplo02()
        {
            println("Exemplo da segunda classe");
        }
    }
}

// CLasses internas - Inner Class
class ClasseExemplo03
{
    var exemploPropriedade03 : String = "Exemplo";

    fun ChamadaExemplo03()
    {
        println(" Exemplo da terceira classe ")
    }

    inner class ClasseExemplo04
    {
        fun ChamadaExemplo04()
        {
            println(" $exemploPropriedade03 da quarta classe ")
        }
    }
}

// Classes enumeradas
enum class ClasseExemplo05
{
    ExemploEnum01, ExemploEnum02, ExemploEnum03
}

enum class ClasseExemplo06 ( var exemploDadosEnum : String)
{
    ExemploValorEnum ( "Passando um atributo para o enum pelo construtor")
}