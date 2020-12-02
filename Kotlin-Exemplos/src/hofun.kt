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

//tipos genérico na declaração de uma função
fun <T> List<T>.paraCada(funcao: (T) -> T): List<T> {
    val returnList: MutableList<T> = mutableListOf()
    this.forEach { returnList.add(funcao(it)) }
    return returnList
}

fun incrementa(i: Int) = i + 1
fun dobra(f: Float) = 2 * f


//fun primeiraLetra(s: String): String = s.first().toString()
fun primeiraLetra(s: String): String = "${s.first()}"

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

    //com genéricos
    familia.paraCada(::primeiraLetra).forEach { println(it) }
    val listaInteiros: List<Int> = (1..10).toList()
    val listaInc: List<Int> = listaInteiros.paraCada(::incrementa)
    listaInc.forEach { println(it) }

    val listFloats: List<Float> = listOf(1f,2f,2.5f,3f)
    var listaDob: List<Float> = listFloats.paraCada(::dobra)
    listaDob.forEach { println(it) }
    val listaTrip: List<Float> = listaInteiros.map { it.toFloat() }.paraCada {  x: Float -> 3 * x }
    listaTrip.forEach { println(it) }
    listaDob = listFloats.paraCada({ f: Float -> 5 * f })
    listaDob = listFloats.paraCada { f: Float -> 5 * f }
    listaDob = listFloats.paraCada() { dobra(it) }
    listaDob = listFloats.paraCada { 2 * it }

}