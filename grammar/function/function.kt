fun main(args: Array<String>) {

    excelTest()
}

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun excelTest() {
    val family = arrayOf("derrick", "summer", "toghter")
    printData(*family)
}
fun printData(vararg sentences : String) {

    var finalSentence = ""
    for(name in sentences) {
        finalSentence += name
    }
    println(finalSentence)
}


fun printData(name:String , value: String) {
    val result = "$name : $value"
    println(result)
}

fun printData(name:String , value: String , thirdValye:String) {
    val result = "$name : $value $thirdValye"
    println(result)
}

fun printData(vararg :String) {
    var result : String = ""
    for(data in vararg) {
        result += data
    }
}

fun max(numbers:IntArray):Int {
    var large = Int.MIN_VALUE
    for (number in numbers) {
        large = if(number > large) number else large
    }
    return large
}