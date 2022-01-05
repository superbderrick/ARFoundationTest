fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var testArray :Array<String> = arrayOf("X++","++X","--X","X--")

    finalValueAfterOperations(testArray)

    println("value ${finalValueAfterOperations(testArray)}")
}

fun finalValueAfterOperations(operations: Array<String>) : Int {

    val plusOper : String = "++"
    val minousOper : String = "--"
    var count = 0

    for (data in operations) {
        if (data.contains(plusOper)) {
            count++

        } else if (data.contains(minousOper)) {
            count--
        }
    }


    return count
}