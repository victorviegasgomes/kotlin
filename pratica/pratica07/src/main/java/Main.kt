fun main(args: Array<String>) {
	//tipos de dados
    //tipos numéricos inteiros
    var num1: Byte = 127
    var num2: Short = 32767
    var num3: Int = 2_147_483_647
    var num4: Long = 9_223_372_036_854_775_807
    //tipos numéricos reais
    var real1: Float = 3.14F
    var real2: Double = 3.14
    //tipos char
    var caracter: Char = '?'
    //tipo lógico
    var bool: Boolean = true
    
    println(listOf(num1, num2, num3, num4, real1, real2, caracter, bool))
    
    println(2 is Int)
    println(2836648768366364 is Long)
    println(1.0 is Double)
    
    println(10.dec())
}
