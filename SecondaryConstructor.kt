/**
 * Secondary Constructor
 */

package ConstructorDemo

import kotlin.system.exitProcess

class SecDemo(var email:String){
    constructor(name: String,email:String,caste:String):this(email){
        println("SeconAdry Constructor")
        println(name)
        println(caste)
        println(email)

    }

}

fun main(args: Array<String>) {
    var SecCons= SecDemo("Khan","khan@gmail.com","nangore")

}

