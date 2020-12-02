
fun processaInteiro(i: Int, f: (j: Int) -> Int): Int = f(i)

fun inverte(x: Int) = x * -1

//se tem : depois é o tipo ... nesse caso é uma função
fun Int.executa(f: (Int) -> Int) = f(this)

fun main() {
    val n: Int = processaInteiro(10, ::inverte)
    println(n)

    val n2: Int = processaInteiro(11, { x: Int -> 2 * x })
    println(n2)
    //não precisa declarar o tipo na função do lambda, pois o tipo já está na função que irá receber
    val n2_1: Int = processaInteiro(11, { x -> 2 * x })
    println(n2_1)
    //qdo não damos nome ao parametro de um lambda, ele se chama it
    val n3: Int = processaInteiro(12, { 3 * it })
    println(n3)
    //qdo lambda é o último parâmetro, o ideal é retirá-la do parênteses
    val n4: Int = processaInteiro(13) { 4 * it }
    println(n4)

    val n5: Int = 16.executa{ x -> x * x }
    //ou
    val n5_1: Int = 16.executa{ it * it }
    println(n5)
    println(n5_1)

    val n6: Int = 17.executa(){3 * it}
    println(n6)

    val fl: (Int) -> Int = { x: Int -> 2 * x }
    val n7: Int = 18.executa(fl)
    println(n7)

    val fl2 = { y: Int -> 3 * y }
    val n8: Int = processaInteiro(19, fl2)
    println(n8)

}
