package Enum

enum class Season(){
    Winter,Summer,Spring,Autumn
}

fun main(args: Array<String>) {
    var seas=Season.Spring
    if (seas==Season.Winter){
        println("Hey Its too Cool")
    } else{
        println("Hey Its SO HOt Day")
    }
}