
//Methods Demo = describe in the class
package Methods

class Person{
    var name ="Aadil"
    var age=26
  fun display(){
      println("Hello !")
  } // end display Method

  fun display(name :String){
      println("Hello $name")
  }// perameterized display closed

}// Person Class End

fun main(args: Array<String>) {
    var person=Person()
    person.display()
    person.display("World")
    println(person.name)
    println(person.age)
}