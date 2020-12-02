enum class TipoOperacao {
    ADD, SUB, DIV, MUL
}

fun div (a: Int, b: Int) = a / b

fun Int.aplica(i: Int, f: (Int, Int) -> Int) = f(this, i)

fun operacao(op: TipoOperacao): (Int, Int) -> Int {
    val sub: (Int, Int) -> Int = { a, b -> a - b}
    return when(op) {
        TipoOperacao.ADD -> { a, b -> a + b}
        TipoOperacao.SUB -> sub
        TipoOperacao.DIV -> ::div
        TipoOperacao.MUL -> fun (a: Int, b: Int): Int { return a * b }
    }
}


fun main (){
    val func = operacao(TipoOperacao.DIV)
    println(10.aplica(2, operacao(TipoOperacao.ADD)))
    println(10.aplica(2, operacao(TipoOperacao.SUB)))
    println(10.aplica(2, operacao(TipoOperacao.MUL)))
    println(10.aplica(2, operacao(TipoOperacao.DIV)))
    println(10.aplica(2, func))
}