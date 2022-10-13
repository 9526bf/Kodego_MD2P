package exercises_1

fun main() {

//    repeat(10) {
//        println("$it-> Romie Quisido")
//
//    }
//
//    for(counter in 0..10){
//        println("$counter : for loop")
//    }

//    for(counter in 0 until 10){
//        println("$counter : for loop")
//    }

//    for(counter in 0..10 step 2){
//        println("$counter : for loop")
//    }

//    for (counter in 10 downTo 0 step 5) {
//        println("$counter : for loop")
//    }
//    var userInput = "1230"
//    var numbers = '0'..'9'
//
//    for (index in 0 until userInput.length) {
//        var char = userInput[index]
//        println("char : $char")
//    }
    var userInput = "12292592309"

    var index = 0
    var found = false

    do {
        val char = userInput[index]
        println("char : $char")
        index++

        if (char == '9') {
            found = true
            println("Found a 9")
        }

    } while ((index < userInput.length) && !found)

    while (true) {

    }
}

