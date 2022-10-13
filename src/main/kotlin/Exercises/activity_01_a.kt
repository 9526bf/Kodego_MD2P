package Exercises

fun main() {
    /*You are tasked to create a directory of the students taking this course.
    The data will be used to send updates regarding the classes.
    There is also a need to know the progress of the students during the progress of this course.
    List down all data that can be used to implement this. Use the proper data types.*/

    println("Enter control number: ")
    val studentControlNumber: Int = readln().toInt()

//Student1
    val studentControlNumber9526: Int = 9526
    val lastName1 =  "Johnson"
    val firstName1 = "David"
    val middleName1 = "Ford"
    val dateOfBirth1 = "March 9, 1974"
    val address1 = "Iloilo City"
    val mobileNumber1: Long = 9812685178
    val classAndSection1: String = "Mobile App Development - MD2P"

    var score1Week1 = 90
    var score1Week2 = 91
    var score1Week3 = 92
    var score1Week4 = 89

    var score1: Int = 90 + 91 + 92 + 89 / 4
    val grade1: Double = 90.5

//Student 2
    val studentControlNumber9527 = 9527
    val lastName2 = "Parkinson"
    val firstName2 = "Matthew"
    val middleName2 = "Jackson"
    val dateOfBirth2 = "July 29, 1984"
    val address2 = "Quezon City"
    val mobileNumber2: Long = 9567766918
    val classAndSection2: String = "Mobile App Development - MD2P"

    var score2Week1 = 89
    var score2Week2 = 88
    var score2Week3 = 91
    var score2Week4 = 89

    var score2: Int = 90 + 91 + 92 + 89 / 4
    val grade2: Double = 89.25

//Student 3
    val studentControlNumber9528 = 9528
    val lastName3 = "Collins"
    val firstName3 = "Simon"
    val middleName3 = "Monroe"
    val dateOfBirth3 = "July 2, 1986"
    val address3 = "Cebu City"
    val mobileNumber3: Long = 9213685178
    val classAndSection3 = "Mobile App Development - MD2P"

    var score3Week1 = 87
    var score3Week2 = 85
    var score3Week3 = 80
    var score3Week4 = 75

    var score3: Int = 87 + 85 + 80 + 75 / 4
    val grade3: Double = 81.75

//Student 4
    val studentControlNumber9529 = 9529
    val lastName4 = "Jefferson"
    val firstName4 = "Jay"
    val middleName4 = "Jones"
    val dateOfBirth4 = "April 2, 1985"
    val address4 = "Davao City"
    val mobileNumber4: Long = 9367329568
    val classAndSection4 = "Mobile App Development - MD2P"

    var score4Week1 = 91
    var score4Week2 = 89
    var score4Week3 = 87
    var score4Week4 = 92

    var score4: Int = 91 + 89 + 87 + 92 / 4
    val grade4: Double = 89.75


//Student 5
    val studentControlNumber9530 = 9530
    val lastName5 = "Monroe"
    val firstName5 = "Marilyn"
    val middleName5 = "Joe"
    val dateOfBirth5 = "April 27, 1980"
    val address5 = "Valenzuela City"
    val mobileNumber5: Long = 9394186347
    val classAndSection5 = "Mobile App Development - MD2P"

    var score5Week1 = 73
    var score5Week2 = 74
    var score5Week3 = 75
    var score5Week4 = 76

    var score5: Int = 73 + 74 + 75 + 76 / 4
    val grade5: Double = 74.5

    if (studentControlNumber == 9526) {
        println("Control Number: $studentControlNumber9526")
        println("Full name: $lastName1, $firstName1 $middleName1")
        println("Date of birth: $dateOfBirth1")
        println("Address: $address1")
        println("Mobile number: $mobileNumber1")
        println("Class and section: $classAndSection1")
        println("grade: $grade1")

    }
    if (studentControlNumber == 9527) {
        println("Control Number: $studentControlNumber9527")
        println("Full name: $lastName2, $firstName2 $middleName2")
        println("Date of birth: $dateOfBirth2")
        println("Address: $address2")
        println("Mobile number: $mobileNumber2")
        println("Class and section: $classAndSection2")
        println("grade: $grade2")

    }
    if (studentControlNumber == 9528) {
        println("Control Number: $studentControlNumber9528")
        println("Full name: $lastName3, $firstName3 $middleName3")
        println("Date of birth: $dateOfBirth3")
        println("Address: $address3")
        println("Mobile number: $mobileNumber3")
        println("Class and section: $classAndSection3")
        println("grade: $grade3")

    }
    if (studentControlNumber == 9529) {
        println("Control Number: $studentControlNumber9529")
        println("Full name: $lastName4, $firstName4 $middleName4")
        println("Date of birth: $dateOfBirth4")
        println("Address: $address4")
        println("Mobile number: $mobileNumber4")
        println("Class and section: $classAndSection4")
        println("grade: $grade4")
    }
    if (studentControlNumber == 9530) {
        println("Control Number: $studentControlNumber9530")
        println("Full name: $lastName5, $firstName5 $middleName5")
        println("Date of birth: $dateOfBirth5")
        println("Address: $address5")
        println("Mobile number: $mobileNumber5")
        println("Class and section: $classAndSection5")
        println("grade: $grade5")
    }
}











