package advanced

fun main() {

    var userName: String? = null
    var needAnyhelp: String? = null

    print("Enter your name:")
    userName = readLine().toString()
    println("Hi $userName")
    println("Do you want to (return/borrow) books")
    needAnyhelp = readLine().toString()

    if(needAnyhelp.lowercase() == "return") {
        println("How may i help you?")
    }else if(needAnyhelp.lowercase() == "n"){
        println("Don't forget I'm here...")

    }else {
        println("Oh okay...")
    }
    println("thank you very much")
}
