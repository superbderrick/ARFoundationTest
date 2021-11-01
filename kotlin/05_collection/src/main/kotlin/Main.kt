fun main(args: Array<String>) {

    listTestFunc()

}

fun listTestFunc () {
    val names = listOf("derrick" , "summer")
    print(names.javaClass)

    for ((index,value) in names.withIndex()) {
        print("$index , $value")
    }
}

fun pairtTestFunc() {
    val airportCodes = listOf("LAX" , "SFO" , "PDX" , "SEA")
    val temperatures = airportCodes.map { code -> code to getTemperatureAtAirport(code) }

}

fun getTemperatureAtAirport(code: String): String = "${Math.round(Math.random() * 30) + code.count()} C"

fun arrayTest() {
    val friends = arrayOf("derrick" , "summer")
    val numbers = arrayOf(1,2,3)

}

fun listTest() {
    val fruits: List<String> = listOf("derrick" , "summer")
    print(fruits)
}

fun setTest() {
    val setTest = setOf<String>("test","test")
    val setmTest = mutableSetOf<Int>(1,2,3)
    val intArray = intArrayOf(1,2,3)

}