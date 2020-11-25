fun main () {
    val numString: String = 10.toString()
    val numDouble: Double = numString.toDouble()
    val numFloat: Float = numDouble.toFloat();
    val numInt: Int = numFloat.toInt()
    println(numInt)

    val any: Any = "Any equivale a Object em Java"
    val string: String = any as String
    println(string)

    //Só converte se for seguro
    val any2: Any = 10.56
    val string2: String? = any2 as? String
    println(string2)

    val any3: Any = "10.56"
    val string3: String? = any3 as? String
    println(string3)

    if(any is String){
        println(any.capitalize().length)
    }
}