package activity_01_h

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}



    /*Create an application that will accept 2 Integers.
It will identify the lower value and bigger value of the two inputs.
Then, your application will print all the prime numbers starting from
the lower number up to the largest number.

Scope :
String
Loops
Input:
1, 4 -> 1, 2, 3
10 -> 1, 2, 3, 5, 7*/

fun main() {

    var firstNumber: Int? = null
    var secondNumber: Int? = null
    var lowerNumber: Int? = null
    var biggerNumber: Int? = null
    var isPrimeNumber: Boolean = true
    var primeNumber = ArrayList<Int>()

    logger.info { "Enter the first number:" }
    firstNumber = readLine()?.toIntOrNull()
    logger.info { "Enter the second number:" }
    secondNumber = readLine()?.toIntOrNull()

    if (firstNumber != null) {
        if (firstNumber > secondNumber!!)
            logger.info { "The bigger value is: $firstNumber" }

        if (secondNumber > firstNumber!!)
            logger.info {
                "The bigger value is: $secondNumber" }

        if (firstNumber >= secondNumber) {
            lowerNumber = secondNumber
            biggerNumber = firstNumber

        } else {
            lowerNumber = firstNumber
            biggerNumber = secondNumber

        }
        for (number in lowerNumber!!..biggerNumber!!) {
            isPrimeNumber = true
            for (divisor in 2 until number)
                if (number % divisor == 0) {
                    isPrimeNumber = false
                }
            if (isPrimeNumber) {
                logger.info { "$number is Prime number." }
            }

        }
    }
    }














