package activity_01_f

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main() {
    /*Create an application that will accept 2 string inputs.

Your application will print all unique characters in both Strings.

Scope : String/Loops     */

    val inputString1: String? = "Kotlin Programming Language"
    val inputString2: String? = "Android Studio"

    if (inputString1 != null) {
        for (inputString1 in inputString1)
            logger.info { "Unique character in String 1 is $inputString1" }
    }

    if (inputString2 != null) {
        for (inputString2 in inputString2)
            logger.info { "Unique character in String 2 is $inputString2" }
    }

}




