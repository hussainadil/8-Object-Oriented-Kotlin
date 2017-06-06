/* Inheritence Child Father Concept
we can access the methods and properties of parent class in child class
*/
package Inheritence



open class Father(){

    fun add(a:Int,b:Int):Int{
        return  a+b
    }
    fun sub(a:Int,b:Int):Int{
        return  a-b
    }

}

class Child(): Father() {

    fun div(a:Int,b:Int):Int{
        return  a/b
    }
    fun mul(a:Int,b:Int):Int{
        return  a*b
    }
}

fun main(args: Array<String>) {
    println("Father Class")
    var Father1=Father()
    println("Add : "+Father1.add(10,7))
    println("Sub : "+Father1.sub(10,7))


    println("Child Class Inheritated With Father Class")
    var Child1=Child()
    println("Add inheritated from Father Class : "+Child1.add(45,56))
    println("Sub inheritated from Father Class : "+Child1.sub(34,26))
    println("Div : "+Child1.div(50,5))
    println("Mul : "+Child1.mul(75,98))

}