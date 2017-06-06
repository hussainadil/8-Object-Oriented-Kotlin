package Casting

open class Father(){

    open fun add(a:Int,b:Int):Int{
        return  a+b
    }
    fun sub(a:Int,b:Int):Int{
        return  a-b
    }

}

    class Child: Father {
    constructor():super(){

    }
    override fun add(a:Int,b:Int):Int{
        return  a+b*3
    }
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
    var Child1=Child() as Father
    println("Add casting from Father Class : "+Child1.add(45,56))
    println("Sub casting from Father Class : "+Child1.sub(34,26))


}