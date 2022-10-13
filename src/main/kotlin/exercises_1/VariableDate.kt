package exercises_1

import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.Date

fun main() {

    var dateNow = Date()
    var dateTimeNow = LocalDateTime.now()
    var dateTime = LocalDateTime.of(2022, Month.OCTOBER, 5, 8, 10)

    var dateFormat1 = DateTimeFormatter.ofPattern("M/d/y H:m:ss")

    println(dateNow)
    println(dateTimeNow)
    println(dateTime)
    println(dateTimeNow.format(dateFormat1))

    //println(dateTimeNow)

}