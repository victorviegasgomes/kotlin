fun main(args: Array<String>) {
	var soma = somar(3, 4)
    imprimir("Resultado da soma: $soma")
}

fun somar(n1: Int, n2: Int) = n1 + n2

fun imprimir(texto: String) = println(texto)
