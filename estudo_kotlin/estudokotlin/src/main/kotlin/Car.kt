class Car(modelo: String, marca : String, valor: Double)
{
    // Outro meio de inicializar uma classe com um construtor!!!
}

class Teste constructor(variavelObrigatoria : String, variavelNaoObrigatoria : String = "Já possui um valor padrão")
{
    // Mais um meio de criar nossas classes com os construtores
}

class MultiplosConstrutores(valorObrigatorio: String, construtorPrincipal : Boolean)
{
    constructor( valorNaoObrigatorio: String ) : this( valorNaoObrigatorio, false )
    {
        // Criando multiplos construtores para a mesma classe, referenciando sempre ao construtor principal
    };
}