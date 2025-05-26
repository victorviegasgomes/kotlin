fun main(args: Array<String>) {
	var arrayInt: Array<Int> = arrayOf(1, 2, 3, 4)
    var i = 2
    
    println("Arrays\n")
    
    println("Array: $arrayInt")
    println("2º elemento do array: " + arrayInt[i] + "\n")
    
    var listaMutavel = mutableListOf(1, 2, 3, 4)
    
    println("Listas\n")
    
    println("Lista Original: $listaMutavel")
    
    listaMutavel.add(5)
    listaMutavel.add(6)
    
    println("Lista Actualizada: $listaMutavel")
}
