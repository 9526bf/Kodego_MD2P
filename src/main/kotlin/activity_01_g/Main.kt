package activity_01_g

//import com.sun.jdi.connect.Connector.BooleanArgument
import mu.KotlinLogging
import java.awt.SystemColor.text

private val logger = KotlinLogging.logger{}
//fun isPalindrome(s: String) {}
fun main() {
    /*Create an application that will accept 1 string.
Your application will print “Palindrome” if the string is a palindrome.
Scope :
String
Loops
Ex :
GIRAFARIG - Palindrome
101 - Palindrome
RACECAR - Palimdrome
GATE - Not Palindrome */

    logger.info{"Phrase: \"was it a car o rac a ti saw\""}
    logger.info{"isPalindrome : ${isPalindrome("was it a car o rac a ti saw")}"}
    logger.info{"________________________________________"}
    logger.info{"Phrase: \"Hello World\""}
    logger.info{"isPalindrome : ${isPalindrome("Hello World")}"}

}
fun isPalindrome(text: String): Boolean {
    val textLen = text.length
    if (textLen < 2) {
        return true
    }
    return text.first() == text.last()
            && isPalindrome(text.substring(1, textLen-1))
}

    


