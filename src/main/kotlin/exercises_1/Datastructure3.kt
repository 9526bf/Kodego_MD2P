import mu.KotlinLogging
import java.util.LinkedList

private val logger = KotlinLogging.logger{}

fun main() {

    var set: Set<String> = HashSet<String>()
    var map: Map<String, String> = HashMap<String, String>()
    var list: List<String> = ArrayList<String>()

    var listNames = ArrayList<String>()
    var listLocations = LinkedList<String>()

    var mapName = HashMap<String, String>()
    var mapLocation = ArrayList<String>()

    var setName = HashSet<String>()
    var setLocation = LinkedHashSet<String>()

    var names: List<String> = mutableListOf<String>("Jason", "Kurt", "Logan", "Monique")
    var numbers: Set<Char> = mutableSetOf('1', '2', '3', '4', '5')
    var characters: Map<String, Int> = mapOf(("One" to 1), ("Two" to 2), ("Three" to 3))

    var locations: List<String> = listOf("Cubao", "Santolan", "Shaw", "Boni", "Buendia")
    var setPoints: Set<Int> = setOf(1, 2, 3, 4, 5)
    var mapPoints: Map<String, Int> = mapOf(("One" to 1), ("Two" to 2), ("Three" to 3))

    var arraylist: ArrayList<String> = names as ArrayList<String>
    var linkedList: LinkedList<String> = names as LinkedList<String>

    for (name in names) {
        logger.info { "Name: $name" }
    }

    for (index in names.indices) {
        logger.info { "Name: [$index]: ${names[index]}" }

    }
}

//    var iterator = names.iterator()
//    while(iterator.hasNext()){
//            logger.info { "Name: [$index]: ${names[index]}" }



