package Exercises

fun main() {
    //You are tasked to automate a school’s library.
    //Identify the items that can be borrowed in a Library.
    //After listing the different items, identify the characteristics of the items.
    //Use the proper data types.


    var idNumber: Int? = null
    var name: String? = null
    val bookTitle: String? = null
    var response: String? = null
    var availableBooks: String = "Business English, Computer Programming, Basic Algebra, Calculus 1"
    val book1 = "Business English"
    val returnDate1 = "October 14, 2022"
    val book2 = "Computer Programming"
    val returnDate2 = "October 16, 2022"
    val book3 = "Basic Algebra"
    val returnDate3 = "October 18, 2022"
    val book4 = "Calculus 1"
    val returnDate4 = "October 20, 2022"

    println("Do you want to borrow a book?")
    response = readLine().toString()

    println("Enter ID Number:")
    idNumber = readLine()?.toInt()

    println("Enter complete name:")
    name = readLine()?.toString()

    println("Do you want to display available books?")
    availableBooks = readLine().toString()

    if (response.lowercase() == "y") {
        println("$book1, $book2, $book3, $book4")

        println("Enter title of book to borrow:")
        availableBooks = readLine().toString()

        if (book1 == "Business English") {
            println("Return by: $returnDate1")

            if (book2 == "Computer Programming") {
                println("Return by: $returnDate2")

                if (book3 == "Basic Algebra") {
                    println("Return by: $returnDate3")

                    if (book4 == "Calculus 1") {
                        println("Return by: $returnDate4")
                    }
                }
            }
        }
    }
}

