import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")



    val testString : String  ="(()())(())(()(()))"

    var finalcount = Solution.removeOuterParentheses(testString)

    println(finalcount)
}

class Solution () {

    companion object {
        private const val OPEN_PAREN = '('
        private const val CLOSED_PAREN = ')'

        fun removeOuterParentheses(S: String): String {
            val stack = LinkedList<Char>()
            val builder = StringBuilder()

            for(ch in S){
                when(ch){
                    OPEN_PAREN -> {
                        if(stack.isNotEmpty()) {
                            builder.append(OPEN_PAREN)
                        }
                        stack.push(OPEN_PAREN)
                    }
                    CLOSED_PAREN -> {
                        stack.pop()
                        if(stack.isNotEmpty()){
                            builder.append(CLOSED_PAREN)
                        }
                    }
                    else -> {}
                }
            }

            return builder.toString()
        }
    }
}

class TestStack(var items: String) {
    private var internalList = items.toMutableList()

    fun push(element:Char) = internalList.add(element)
    fun pop() = internalList.removeAt(internalList.size -1)
    fun empty() = internalList.isEmpty()
    fun size() = internalList.size



}