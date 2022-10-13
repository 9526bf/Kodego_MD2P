package Exercises

fun main() {

    /*Create an application that will accept 5 monetary amounts.
    After the input is done, the user will be asked “Divide the value by how many?”.
    It will only accept an Integer as input.
    The total of the 5  input will be divided by the answer in the second question input.
    Note: Error checking must be done.*/

    var amount1:  Int? = null
    var amount2:  Int? = null
    var amount3:  Int? = null
    var amount4:  Int? = null
    var amount5:  Int? = null
    var amount: Long? = null
//INPUTS

    println("Please enter first amount:")
    readlnOrNull().also { amount1 = 0 }

    println("Please enter second amount:")
    readlnOrNull().also { amount2 = 0 }

    println("Please enter third amount:")
    readlnOrNull().also { amount3 = 0 }

    println("Please enter fourth amount:")
    readlnOrNull().also { amount4 = 0 }

    println("Please enter fifth amount:")
    readlnOrNull().also { amount5 = 0 }

    var result:Long = 0L

    println("Divide the value by how many?")
    //readlnOrNull().also { result = 0 + 0 + 0 + 0 + 0 / 0L}
//    result = (0 + 0 + 0 + 0 + 0
    readLine()?.toInt().also { result = Long.MAX_VALUE}

//
//
//    //PEMDAS
//    result = 10 * 12 % 5

    println("Result : $amount")
}

