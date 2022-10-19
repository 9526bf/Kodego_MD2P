package activity_01_d

import mu.KotlinLogging

lateinit var dogBreeds : Array<String>
private val logger = KotlinLogging.logger{}

//fun arrayOfNulls() {


fun main() {

//    /*Create an application that will accept 5 monetary amounts.
//    After the input is done, the user will be asked “Divide the value by how many?”.
//    It will only accept an Integer as input.
//    The total of the 5  input will be divided by the answer in the second question input.
//    Note: Error checking must be done.*/

    var userInput: String?
    var amount1: Double = 0.0
    var amount2: Double = 0.0
    var amount3: Double = 0.0
    var amount4: Double = 0.0
    var amount5: Double = 0.0
    var divisor: Int = 0
    var sum: Double = 0.0
    var quotient: Double
    var valid = false

    do {
        logger.info { "Enter amount 1:" }
        userInput = readLine().toString()
        if (userInput.toDoubleOrNull() == null) {
            logger.error("Please enter a valid amount:")

        } else {
            amount1 = userInput.toDouble()
            valid = true
        }
    } while (!valid)
    valid = false

    do {
        logger.info { "Enter amount 2:" }
        userInput = readLine().toString()
        if (userInput.toDoubleOrNull() == null) {
            logger.error("Please enter a valid amount:")

        } else {
            amount2 = userInput.toDouble()
            valid = true
        }
    } while (!valid)
    valid = false

    do {
        logger.info { "Enter amount 3:" }
        userInput = readLine().toString()
        if (userInput.toDoubleOrNull() == null) {
            logger.error("Please enter a valid amount:")

        } else {
            amount3 = userInput.toDouble()
            valid = true
        }
    } while (!valid)
    valid = false

    do {
        logger.info { "Enter amount 4:" }
        userInput = readLine().toString()
        if (userInput.toDoubleOrNull() == null) {
            logger.error("Please enter a valid amount:")

        } else {
            amount4 = userInput.toDouble()
            valid = true
        }
    } while (!valid)
    valid = false

    do {
        logger.info { "Enter amount 5:" }
        userInput = readLine().toString()
        if (userInput.toDoubleOrNull() == null) {
            logger.error("Please enter a valid amount:")

        } else {
            amount5 = userInput.toDouble()
            valid = true
        }
    } while (!valid)
    sum = amount1 + amount2 + amount3 + amount4 + amount5
    logger.info { "Total amount = $sum" }

    valid = false
    do{
        logger.info { "Divide the the total amount by how many?" }
        userInput = readLine().toString()
        if (userInput.toIntOrNull() == null){
            logger.error { "Please enter a valid number:" }
        }else{
            divisor = userInput.toInt()
            valid = true
        }
    }while (!valid)

    quotient = sum / divisor.toDouble()
    logger.info { "Quotient = $quotient" }

}





















