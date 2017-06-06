// Simple Abstract Demo
package Abstract

abstract class CreditCard(){
    fun creditId():String{ return "8734674657" }

    abstract  fun NewCreditCard()
}
class GetInfo():CreditCard(){
    fun Num():String{
        return creditId()
    }

    override fun NewCreditCard() {
    println("New Credit Card Created")
    }
}
 
fun main(args: Array<String>) {
    var getinfo=GetInfo()
    println("Number IS : "+getinfo.creditId())
    getinfo.NewCreditCard()
}