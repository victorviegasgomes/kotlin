fun main(args: Array<String>) {
	var x = 3
    when(x) {
        in 1..10 -> println("x está no intervalo de 1 à 10")
        else -> println("x está fora do intervalo de 1 à 10")
    }
}
