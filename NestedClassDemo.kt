package NestedClass

class Outer{
     private val name:String="Aadil"
    init {
        println(name)
    }
     class Inner{
        fun Show(){
            println("Show")
        }// method end
    }//inner end
}// outer end

fun main(args: Array<String>) {
    var n=Outer()

    var m=Outer.Inner()
    m.Show()
}