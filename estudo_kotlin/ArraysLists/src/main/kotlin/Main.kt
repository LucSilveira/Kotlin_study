fun main(args: Array<String>)
{
    var idades = IntArray(5);
    idades[0] = 22
    idades[1] = 23
    idades[2] = 20
    idades[3] = 26
    idades[4] = 28

    var maiorIdade = 0;
    var menorIdade = 0;

    // Cria um elemento imutável para representar o valor que ele está percorrendo
    for (idade in idades)
    {
        if(idade > maiorIdade)
        {
            maiorIdade = idade;
        }

        if( menorIdade > idade || menorIdade == 0 )
        {
            menorIdade = idade
        }
    }

//    println(menorIdade)
//    println(maiorIdade)

    // ______________________________________________

    var idades02 : IntArray = intArrayOf(22, 23, 24, 25, 26)

    idades02.forEach { idade ->
        //println(idade)
    }

    idades02.forEachIndexed { index, element ->
//        println( index)
//        println(element)
    }


    // ___________________________________________________

    // de 0 até 10 - until
    // de 10 até 0 - downTo
    for (i in 0 until  10)
    {
//        println(i)
    }

    // /________________________________

    var i = 0
    while( i < 10)
    {
//        println(i)
        i++
    }

    // ____________________________________--

    var idades03 : IntArray = intArrayOf(1, 2, 3, 4, 5);

    for ( indice in idades03.indices )
    {
        idades03[indice] = idades03[indice] * 2;
    }

//    println( idades03.contentToString() )

    //_________________________________
    var idades04 : Array<Int> = Array<Int>(4){0};
//    println(idades04.contentToString())

    //____________________________________
    var idades05 = criandoArrayDinamico(1, 2, 4);
    println( idades05.contentToString() );

    // Aplicando valores dentro do array
    var array = arrayOf<String>()  // Cria um array vazio com tamanho zero

    // Adiciona elementos ao array usando a função plus()
    array = array.plus("elemento1")
}

fun criandoArrayDinamico( vararg valores : Int ) : Array<Int>
{
    return Array<Int>(valores.size) {i ->
        valores[i]
    }
}

var listaCarros : MutableList<Carro> = mutableListOf();

listaCarros.add( novoCarro )
var usuarioTeste = User02("teste", listaCarros)

for (carros in usuarioTeste.carros)
{
    println(carros.modelo)
}
