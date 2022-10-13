fun main() {
    var result = 1 + 1
    var result2 = true && false
    var result3 = true is Boolean
    var passedKotlin = true
    var state = "not"

    var hasCough = false
    var temperature = 36.4
    var hasFever = false

    if(hasCough || hasFever || temperature > 37){
        println("Do not enter")
    }else{
        println("Will enter")
    }

    var minorAgeRange = 0..17
    var age = 90

    if(age in minorAgeRange){
        print("You can not enter")
    }
}