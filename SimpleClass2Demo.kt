package SimpleClass

class Car(Type:String,Price:Int,Model:Int,Miles:Double,Owner:String){
    var Type:String?=null
    var Price:Int?=null
    var Model:Int?=null
    var Miles:Double?=null
    var Owner:String?=null
    init {
        println("Type:  $Type")
        println("Price: $Price")
        println("Model: $Model")
        println("Miles: $Miles")
        println("Owner: $Owner")
        this.Type=Type
        this.Price=Price
        this.Model=Model
        this.Miles=Miles
        this.Owner=Owner
    }// init fun close

    fun GetPrice():Int?{

        return this.Price!!-(this.Miles!!.toInt()*5)
    }
    fun GetOwner():String?{
        return this.Owner

    }
}// Car Class close

fun main(args: Array<String>) {

    var AdilCar=Car("BMW",20000,2017,2388.76,"Aadil Khan")
    println("*****************")
    println("Owner Is :"+AdilCar.GetOwner())
    println("Price Is :"+AdilCar.GetPrice())

    var AsimCar=Car("Cultus",120000,2014,2568.76,"Aasim Khan")
    println("*****************")
    println("Owner Is :"+AsimCar.GetOwner())
    println("Price Is :"+AsimCar.GetPrice())
}