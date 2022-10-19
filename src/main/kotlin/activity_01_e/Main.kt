package activity_01_e

import mu.KotlinLogging

lateinit var dogBreeds : Array<String>
private val logger = KotlinLogging.logger{}

fun main() {

    //Identify 3 uses cases that will efficiently use an Array, ArrayList, Set, Map.

    var luxuryCarList: List<String> = mutableListOf<String>("Ferrari", "BMW", "Porsche", "Mustang", "Volvo", "Audi")
    var luxuryCarList2: Set<String> = setOf(
        "Ferrari",
        "BMW",
        "Porsche",
        "Ferrari",
        "BMW",
        "Porsche",
        "Mustang",
        "Volvo",
        "Audi",
        "Mercedes Benz",
        "Volvo",
        "Audi"
    )
    var priceInDollar = mapOf<String, Double>(
        "Ferrari" to 321400.00,
        "BMW" to 141300.00,
        "Porsche" to 114000.00,
        "Mustang" to 95000.00,
        "Volvo" to 85000.00,
        "Audi" to 87000.00
    )

    var arraylist: ArrayList<String> = luxuryCarList as ArrayList<String>

    logger.info(luxuryCarList[5])
    logger.info(luxuryCarList[4])
    logger.info(luxuryCarList[3])
    logger.info(luxuryCarList[2])
    logger.info(luxuryCarList[1])

    for (arrayList in luxuryCarList)
        logger.info { "Luxury car brands are: $luxuryCarList" }

    for (set in luxuryCarList2)
        logger.info { "Luxury car brands are: $luxuryCarList2" }

    logger.info { "Luxury car brands : ${luxuryCarList.size}" }
    for (index in 0 until luxuryCarList.size) {
        logger.info { "Luxury car brands: [${index}] : ${luxuryCarList[index]}" }

        priceInDollar.forEach { t, u ->
            logger.info { "$t, price is $u" }
        }


    }
}