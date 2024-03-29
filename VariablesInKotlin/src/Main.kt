
fun main(){
    val isActive=true
    val max=99
    var getValue=if(isActive && max==100){
        println("The value assigned is true")
        max
    }else{
        println("The value assigned is false")
        "hello"
    }
    println("value of max is :$getValue")

    val sampleValue=10
    var s=when(sampleValue){
        in 1..5 -> "between 1..5"
        in 6..10 -> "between 6..10"
        else->"not in above range"
    }
    println("$s")
}