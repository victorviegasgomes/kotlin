fun main(args: Array<String>) {
	var numeros = listOf(1,2,3,4)
    for((index, valor) in numeros.withIndex()) {
        println("índice: $index \tvalor: $valor")
    }
}
