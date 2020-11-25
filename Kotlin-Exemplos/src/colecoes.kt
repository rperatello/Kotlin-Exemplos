fun main() {
    // List é imutável
    var familia: List<String> = listOf("Pedro", "Marcela", "João", "Cadu")

    //percorrendo
    for (integrante in familia){
        println(integrante)
    }

    // List de inteiros
    var listaInteiros: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)

    for (i in 0..9){
        println(listaInteiros[i])
    }

    val listaInteiros2: List<Int> = (1..10).toList()
    println((1..10 step 2).javaClass)

    for (i in 0..9){
        println(listaInteiros2[i])
    }

    val listaInteiros3: List<Int> = (1..10 step 2).toList()
    println((1..10 step 2).javaClass)

    for (i in 0 until listaInteiros3.size){
        println(listaInteiros3[i])
    }

    println("Imprimindo List com forEach com it de iterable - nome padrão")
    listaInteiros3.forEach { println("Elemento: $it") }
    println("outro com forEach")
    listaInteiros3.forEach { x: Int -> println("Elemento: $x") }
    println("outro com forEachIndexed")
    listaInteiros3.forEachIndexed({ index, x: Int -> println("Elemento $index: $x") })

    // List mutável - Precisa explicitar
    var listaCurso: MutableList<String> = mutableListOf("ADS", "ADM", "ENG", "MAT")

    listaCurso.add("Letras")
    listaCurso.add("Técnico")

    println("Imprimindo List com forEach com it de iterable - nome padrão")
    listaCurso.forEach { println(it) }

    // Set e Mutableset
    var setCurso: MutableSet<String> = mutableSetOf("ADS", "ADM", "ENG", "MAT")
    setCurso.add("ADS")
    setCurso.add("ADM")

    setCurso.forEach { println(it) }
    println("teste".javaClass)
    println("setCurso".javaClass)

    // Map, MatableMapm HashMap
    val familiaMap: MutableMap<String, String> = mutableMapOf(
            Pair("Pai", "Pedro"),
            Pair("Mãe", "Marcela"),
            Pair("Filho", "JP")
    )
    //familiaMap.put("Pet", "Paçoca")
    //Abaixo é o mais indicado
    familiaMap["Pet"] = "Paçoca"
    familiaMap.keys.forEach { println("$it - ${familiaMap[it]}") }

}