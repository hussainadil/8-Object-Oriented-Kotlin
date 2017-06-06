package ConstructorDemo

class Person(val name:String,var age:Int){
    init {
        println("Object is Created")
    }


}// Person Class End

fun main(args: Array<String>) {
    var person=Person("Aasim",17)
    println(person.name)
    println(person.age)
}