package exercises_1

import mu.KotlinLogging

lateinit var dogBreeds : Array<String>
val logger = KotlinLogging.logger{}

fun main(){
    var books = Array<String>(100){
        ""
    }

    var stations: Array<String> = arrayOf("Taft, Magallanes, Ayala")

    for(stations in stations) {
        activity_01_d.logger.info { "Stations : $stations" }

    }

    activity_01_d.logger.info { "stations : ${stations.size}"}
    for(index in 0 until  stations.size) {
        activity_01_d.logger.info { "UNTIL Station : [${index}] : ${stations[index]}" }

    }

    for(index in stations.indices) {
        activity_01_d.logger.info { "USING indices Station : [${index}] : ${stations[index]}" }
    }

    activity_01_d.logger.info {"Station : ${stations[0]}"}

    var arrayOfNumbers = Array(5, {i ->i + +1})
    var arrayOfIntegers = arrayOf(1, 3, 4, 7, 11, 18)
    var arrayOfIntegers2 = arrayOf(2, 4, 6, 8, 10, 0)

    arrayOfIntegers.set(2, 0)
    arrayOfIntegers[1] = 100

    arrayOfIntegers.forEach {
        activity_01_d.logger.info { "For each : $it"}
    }

    activity_01_d.logger.info {"Average : ${ arrayOfIntegers.average() }"}
    activity_01_d.logger.info {"Sum : ${ arrayOfIntegers.sum() } "}
    activity_01_d.logger.info{"Max : ${ arrayOfIntegers.max() }"}
    activity_01_d.logger.info {"Min : ${ arrayOfIntegers.min() }"}
    activity_01_d.logger.info{"Max : ${ arrayOfIntegers.plus(arrayOfIntegers2) }"}
}

//
//    numbers = Array(10){
//        0
//    }
//
//    for(station in stations){
//
//
//    for(index 0 until stations.size in stations){
//        logger.info {"Station : $stations"}
//
//    logger.info { "Station : ${stations[0]}"}
