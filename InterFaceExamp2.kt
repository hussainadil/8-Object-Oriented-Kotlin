// Interface Demonstration
package Interface

interface Demo{
    fun add(a:Int,b:Int):Int
    fun sub(a:Int,b:Int):Int

}

class sum:Demo {
    override fun add(a: Int, b: Int): Int {
        return a+b
    }

    override fun sub(a: Int, b: Int): Int {
        return a-b
    }

}
class sum1:Demo {
    override fun add(a: Int, b: Int): Int {
        return a+b*2
    }

    override fun sub(a: Int, b: Int): Int {
        return a-b*4
    }

}

fun main(args: Array<String>) {
    var todo =sum()
    println(todo.add(10,78))
    println(todo.add(10,3))

}