fun main() {
    //mutável
    var frase: String = "Hello, World!"
    frase = "Olá, mundo!"

    println(frase)

    //tipos explícitos
    var nome: String = "Pedro"

    //tipos implícitos
    var sobrenome = " Nobile"

    //inicialização tardia
    var nomeMeio: String 
    nomeMeio = "Northon"

    //float
    val altura: Float = 1.74f

    //Int
    val idade: Int = 37

    //Casting
    var peso: Double = 72.toDouble()
    println("${nome} $nomeMeio $sobrenome, ${altura}, ${peso}, ${idade}")
}