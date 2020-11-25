fun processaTexto(s1: String, s2: String, processa: (String, String) -> String): String{
    return processa(s1, s2)
}

fun concatena (a: String, b: String): String = "$a$b"

fun inverte (a: String, b: String): String = "${b.reversed()}${a.reversed()}"

fun List<String>.paraCadaString(funcao: (String) -> String): List<String> {
    val returnList: MutableList<String> = mutableListOf()
    for (s in this){
        returnList.add(funcao(s))
    }
    return returnList
}

fun primeiraLetra(s: String): String = s.first().toString()

fun main(){
    val x = "Olá, "
    val y = "Mundo"
    println(processaTexto(x,y, ::concatena))
    println(processaTexto(x,y, ::inverte))
    println(processaTexto(x, y, { a,b -> concatena(a,b) } ))
    println(processaTexto(x, y, { a, b -> "$a$b" }))
    println(processaTexto(x, y, { a, b -> "${a.decapitalize()}${b.toUpperCase()}" }))

    var familia: List<String> = listOf("Pedro", "Marcela", "João", "Cadu")
    familia.paraCadaString(::primeiraLetra).forEach { println(it)}
    familia.paraCadaString { it.last().toString() }.forEach { println(it)}
}