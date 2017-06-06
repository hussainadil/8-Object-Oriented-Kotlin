package Interface

interface op {

    fun sum(a: Int, b: Int) { println(a*b)}
}

class interfaceDemo:op {
    override fun sum(a: Int, b: Int) {
        println(a+b)
    }
}

class interfaceDemo2:op {
    override fun sum(a: Int, b: Int) {
        println(a-b)
    }
}
class interfaceDemo3:op {

}

fun main(args: Array<String>) {
    var op1=interfaceDemo()
    println(op1.sum(10,12))

    var op2=interfaceDemo2()
    println(op2.sum(50,30))

    var op3=interfaceDemo3()
    println(op3.sum(30,5))
}