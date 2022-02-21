    val oneToFive : IntRange = 1..5
    val aToE: CharRange = 'a'..'e'
    val seekHelp : ClosedRange<String> = "hell".."help"

    for(i in 1..5) {
        print("value $i")
    }
    for(ch in 'a'..'e') {
        print(ch)
    }

    for(i in 5.downTo(1)) {
        print(i)
    }

    for(k in 5 downTo 1) {
        print(k)
    }

    for(i in 1 until 5) {
        print(i)
    }

    for(k in 1 until 10 step 3) {
        print(k)
    }

    for(i in 10 downTo 0 step 3) {
        print(i)
    }

    for(i in (1..9).filter { it % 3 == 0 || it % 5 == 0 }) {
        println(i)
    }

    val list = listOf<Int>(1,2,3)
    for (i in list) {
        println(i)
    }

    val names = listOf<String>("derrick" , "summer" )
    for (index in names.indices) {
        println("value ${names.get(index)}")
    }
    for((index,newName) in names.withIndex()) {
        print("what $index + : $newName")
    }
    fun printWhatToDo(dayOfWeek : Any) {
    when(dayOfWeek) {
        "Saturday" , "Sunday" -> println("Relax")
        in listOf<String>("Monday","Tuesday","Wendnesday") ->
            println("workhard")
        in 2..4 -> println("Work hard")
    }
}

fun systemInfo() : String {
    val numberOfCores = Runtime.getRuntime().availableProcessors()
    return when (numberOfCores) {
        1 -> "1core"
        in 2..16 -> "multi"
        else -> "None"
    }
}