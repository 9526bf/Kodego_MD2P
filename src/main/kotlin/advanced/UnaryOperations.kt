package advanced

fun main() {
    var increment = 0
    var decrement = 0
    var plusplus = 0
    var minusminus = 0


//    increment = increment + 1
    increment += 2
    println("Increment : $increment")
    //decrement = decrement - 1
    decrement -= 2
    println("Decrement: $decrement")

    print("Plus plus: ${plusplus++}")
    println("Minus minus: ${--minusminus}")
}
