package activity_01_d

import mu.KotlinLogging

lateinit var dogBreeds : Array<String>
val logger = KotlinLogging.logger{}

fun main() {

//    /*Create an application that will accept 5 monetary amounts.
//    After the input is done, the user will be asked “Divide the value by how many?”.
//    It will only accept an Integer as input.
//    The total of the 5  input will be divided by the answer in the second question input.
//    Note: Error checking must be done.*/

    logger.info("INPUT 5 MONETARY AMOUNT")

    logger.info("Please enter first amount:")
    var amount1: Double? = readLine()?.toDouble()
    logger.info("Please enter second amount:")
    var amount2: Double? = readLine()?.toDouble()
    logger.info("Please enter third amount:")
    var amount3: Double? = readLine()?.toDouble()
    logger.info("Please enter fourth amount:")
    var amount4: Double? = readLine()?.toDouble()
    logger.info("Please enter fifth amount:")
    var amount5: Double? = readLine()?.toDouble()
    logger.info("Divide the value by how many?")
    var userInput: Int? = readLine()?.toInt()
    logger.info("Result: $userInput")
    var numberToDivide: Int? = readLine()?.toInt()



    if (amount1 == null) {
        do {
            logger.error { "Please enter the correct input!" }
        } while (amount1 == null)
    }

    if (amount2 == null) {
        do {
            logger.error { "Please enter the correct input!" }
        } while (amount2 == null)
    }

    if (amount3 == null) {
        do {
            logger.error { "Please enter the correct input!" }
        } while (amount3 == null)
    }

    if (amount4 == null) {
        do {
            logger.error { "Please enter the correct input!" }
        } while (amount4 == null)
    }

    if (amount5 == null) {
        do {
            logger.error { "Please enter the correct input!" }
        } while (amount5 == null)
    }

    if (userInput == null) {
        do {
            logger.error { "Please enter the correct input!" }
        } while (userInput == null)
    }
    if (userInput == null) {
        do {
            logger.info { "Result : $numberToDivide" }
        } while (userInput == null)
    }


    if (numberToDivide == null) {

//        do {

            logger.info { "Result = $amount1 + $amount2 + $amount3 + $amount4 + $amount5 / $numberToDivide" }
//        }while ("result = null")

    }
}








//    } while (userInput == null)
//        logger.info { "Result : $result" }




//
//        if (amount2 != null) {
//            logger.info {"Result : $result"}
//
//            if (amount3 != null) {
//                logger.info {"Result : $result"}
//
//                if (amount4 != null) {
//                    logger.info {"Result : $result"}
//
//                    if (amount5 != null) {
//                        logger.info {"Result : $result"}
//
//                        if (userInput != null) {
//                            logger.info { "Result : $userInput" }
//
//                        }else {logger.info { "Result : $result" }
//
//                                }
//
//                            }
//                        }
//                    }
//                }
//            }
//        }



