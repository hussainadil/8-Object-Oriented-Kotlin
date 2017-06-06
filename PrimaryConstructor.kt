/*Defining Primary Constructor
* This is first directly call without using init block
* This is second way to using init block
* */
package ConstructorDemo

class PrimaryCons(var username:String,var password:String){
    init {
        println("Init Block Executed")
        println(username)
        println(password)
    }
}//class and primary cons end

fun main(args: Array<String>) {

    var INITBlock=PrimaryCons("aasim","rajper")

    var CallPrimaryCons=PrimaryCons("aadil","nangore")
    println(CallPrimaryCons.username)
    println(CallPrimaryCons.password)

}