import mu.KotlinLogging

lateinit var dogBreeds : Array<String>
private val logger = KotlinLogging.logger{}
fun main() {
    var rectangleDimensions = Array(4) { { "" } }

    var xPosition = intArrayOf(1, 2, 3)
    var yPosition = intArrayOf(2, 3, 4)// X,Y
    var zPosition = intArrayOf(2, 3, 4, 5)
    var location = Array(4) { Array(4) {} } //lat, long

}

//    for(xposition in position){
//        for(xposition in position{
//            logger.info {"position : $xposition"}
//        }
//
//    }

//    for(row in position.indices){
//       for(xPositions in position[xposition].indices){
//            logger.info {"position : $xposition, $yposition"} = [${position[xposition][yposition]}]"}
//}

//var threeDimension = Array(4){Array(4){Array<String>(4){"}}}//dimensional array