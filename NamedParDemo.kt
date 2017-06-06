
package NamedParameters
class House (val height:Double,val color:String, val price :Int){
    fun print(){
        println("House : Height = $height , Colour = $color , Price = $price")
    }

}

fun main(args: Array<String>) {
    val house=House(height = 50.4,color = "White",price = 150000)
    val redHouse=House(color = "Red", height = 50.4 ,price = 150000)
    house.print()
    redHouse.print()
}