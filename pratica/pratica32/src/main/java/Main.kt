fun main(args: Array<String>) {
	var c = Carro()
    c.cor = "Azul"
    c.marca = "Nissan 360z"
    
    println("Marca: ${c.marca}")
    println("Cor: ${c.cor}")
    
    c.acelerar()
    
    println()
    
    var c2 = CarroEspecial()
    c2.cor = "Vermelho"
    c2.marca = "Ford Mustang"
    
    println("Marca: ${c2.marca}")
    println("Cor: ${c2.cor}")
    
    c2.acelerar()
    c2.fazerDrift()
}

open class Carro {
    var cor: String = ""
    var marca: String = ""
    
    fun acelerar() {
        println("acelerando")
    }
    
    fun frear() {
        println("freando")
    }
}

class CarroEspecial : Carro() {
    fun fazerDrift() {
        println("fazendo um drift muito louco!")
    }
}
