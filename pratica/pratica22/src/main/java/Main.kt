fun main(args: Array<String>) {
	var lista = mutableListOf(2, 7, 8, 3, 0)
    println(lista)
    println()
    println(lista.first())
    println(lista.last())
    var pares = lista.filter{it % 2 == 0}
    println(pares)
}
