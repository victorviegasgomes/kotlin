fun main(args: Array<String>) {
	var b1 = true;
    var b2 = false;
    
    var c1 = b1.and(b2);
    var c2 = b1.or(b2);
    var c3 = b1.not();
    
    println("$c1 $c2 $c3");
}
