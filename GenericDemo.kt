package Generic

class UserAdmin <T>(credit:T){
    init {
        println(credit)
    }
}

fun main(args: Array<String>) {
    var name=UserAdmin<String>("Aadil")
    var num=UserAdmin<Int>(44)
    var numD=UserAdmin<Double>(44.454)
    var numF=UserAdmin<Float>(44.53F)
    var numL=UserAdmin<Long>(445454)


}