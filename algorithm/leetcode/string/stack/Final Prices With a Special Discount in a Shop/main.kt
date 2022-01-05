fun main(args: Array<String>) {
    var testArray : IntArray = intArrayOf(8,4,2,6,3)


    for (i in finalPrices(testArray)) {
        println(i)
    }
}

class DerrickStack<E>( vararg  items:E) {
    private val elements = items.toMutableList()

    fun push(element:E) = elements.add(element)
    fun peek(): E = elements.last()
    fun isEmpty() = elements.isEmpty()
    fun size() : Int = elements.size
    fun pop(): E = elements.removeAt(elements.size - 1)

}

fun finalPrices(prices: IntArray): IntArray {

    var stack = DerrickStack<Int>()


    var n = prices.size

    for (i in 0 until n) {
        while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
            val index = stack.pop()
            prices.set(index, prices[index] - prices[i])
        }
        stack.push(i)
    }

    return prices
}

