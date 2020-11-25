import java.lang.NullPointerException

fun main() {
    var nome: String = "Pedro"

    var sobrenome: String?
    sobrenome = null

    sobrenome = "Nobile"
    println(sobrenome)

    sobrenome = null
    println(sobrenome)

    println(sobrenome?.length)
    println(sobrenome?.capitalize())

    var sn: String
    sn = sobrenome ?: "Nobile"
    println(sn)
    println(sn?.length)
    println(sn?.capitalize())

}