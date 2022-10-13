package advanced

fun main() {
    var strName:String = "Romie Quisido"
    var strName2:String = "name"
    var strName3:String = "NAme"
    var strName4:String = "Name"
   //var birthDate:Date
    //var money:BigDecimal

    println("name : $strName")

    strName = "Mr. $strName"
    println("Name : $strName")

    strName = "$strName, Jr."
    println("Name : $strName")
}