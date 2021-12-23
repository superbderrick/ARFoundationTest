fun main(args: Array<String>) {
    println("Hello World!")

    val testString : String  ="(()())(())"

    var finalcount = Solution.checkParent(testString)

    println(finalcount)
}

class Solution () {

    companion object {
        fun checkParent( sentences:String): Int {
            var count = 0
            var n = sentences.length
            var stack = TestStack(sentences)


            for(i:Int in 0.. n-1 step (1)) {
                if (sentences[i] == '(') {
                    count++
                    stack.push(sentences[i])
                } else if(sentences[i] == ')') {
                    count--
                    stack.pop()
                }

            }
            return count
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