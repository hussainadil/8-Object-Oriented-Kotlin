package SingleTon

class SingleTon{
    var name:String?=null
   private constructor(){
        println("Instance is created")
    }
    companion object{
        val instance:SingleTon by lazy { SingleTon() }
    }

}

fun main(args: Array<String>) {
    var n=SingleTon.instance
    n.name="Aadil"
    println(n.name)
    var n1=SingleTon.instance
    println(n1.name)
    var n2=SingleTon.instance
    println(n2.name)
}