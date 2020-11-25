//b possui valor padrão caso não seja passado
fun multiplo (a: Int, b: Int = 3): Boolean {
    val c: Int = a % b
    if (c == 0){
        return true
    }
    return false
}
fun Int.mult(b: Int): Boolean {
    val c: Int = this % b
    if (c == 0) {
        return true
    }
    return false
}

// permite chamar de 2 formas diferentes - linhas 25 e 26 desse código
infix fun Int.mult2(b: Int): Boolean {
    return multiplo(this, b)
}

fun main (){
    val x: Int = 10
    println(10.mult(3))
    println(10.mult2(3))
    println(10 mult2 2)
    println(multiplo(10,3))

    //Qdo o valor padrão não está no ultimo ou em todos, para assegurar pode usar chamada nomeada
    println(soma(b=5))
    println("Mult3")
    println(mult3(b=2))
    println("Mult4")
    println(mult4(b=2))

}

fun soma(a: Int = 3, b: Int ): Int {
    return a + b
}

fun mult3(a: Int = 10, b: Int ): Boolean = if(a % b == 0) true else false
fun mult4(a: Int = 10, b: Int ): Int = a*b