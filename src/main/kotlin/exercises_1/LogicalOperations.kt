package exercises_1

fun main() {
    var apple1 = "Apple"
    var apple2 = "apple"
    var apple3 = "ApPLe"
    var apple4= "Apple"
    var int: Int = 100
    var short:Short = 100
    var long:Long = 100

    var result:Boolean = false

    println("$result")

    result = long == short.toLong()
    result = long != short.toLong()
    result = apple1 > int.toString()
    result = apple1 < int.toString()
    result = apple1 <= int.toString()
    result = apple1 >= int.toString()
    result = apple1.equals(apple2,true)
    result = apple1.uppercase() == apple2.uppercase()

    result = !true
    result = !(apple1 >= int.toString())

    var hasNotExceededAbsences = true

    result = ((100 + 90 + 40) / 3) > 60 && hasNotExceededAbsences

    // true and true = true
    // true and false = false
    // false and true = false
    // true and false = false

    result = false && true
    result = true && true

    // true or true = true
    // true or false = true
    // false or true = true
    // false or false = false

    result = true || false
    result = true or false

    var hasCough = false
    var temperature = 36.4
    var hasFever = false

    result = hasCough || hasFever || temperature > 37

    // Type checking = is
    result = (10 > 0) is Boolean

    // tpe Casting as
//    var distance = 10
//    var newDistance = distance.toInt()
//
//    var distanceTypecast = distance as Double

    println("Result : $result")

}