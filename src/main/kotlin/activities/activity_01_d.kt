package activities

import mu.KotlinLogging

lateinit var dogBreeds : Array<String>
val logger = KotlinLogging.logger{}

fun main(){

//    /*Create an application that will accept 5 monetary amounts.
//    After the input is done, the user will be asked “Divide the value by how many?”.
//    It will only accept an Integer as input.
//    The total of the 5  input will be divided by the answer in the second question input.
//    Note: Error checking must be done.*/



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

    var userInput: Int? = readLine()?.toInt()
    logger.info("Divide the value by how many? = $userInput")
    var result: Int? = null


    if (amount1 != null) {
        logger.info {"Result : $result"}

        if (amount2 != null) {
            logger.info {"Result : $result"}

            if (amount3 != null) {
                logger.info {"Result : $result"}

                if (amount4 != null) {
                    logger.info {"Result : $result"}

                    if (amount5 != null) {
                        logger.info {"Result : $result"}

                        if (userInput != null) {
                            logger.info {"Result : $result"}

                                }

                            }
                        }
                    }
                }
            }
        }



