import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    var sol = Solution()
    var result= sol.solution(intArrayOf(95,96,98), intArrayOf(1,1,1))

    for(i in 0..result.size-1){ println(result[i]) }



}

class Solution {

    fun solution(progresses: IntArray , speeds : IntArray) : IntArray {
        var answer:IntArray
        var queue:Queue<Int> = LinkedList<Int>()

        for (i in 0 ..progresses.size -1) {
            var leftDay = 0;

            leftDay = (100 - progresses[i] / speeds[i])

            if((100 - progresses[i]) % speeds[i] != 0) {
                leftDay++
            }
            queue.add(leftDay)
        }
        var result = mutableListOf<Int>()

        while (!queue.isEmpty()) {
            var count = 1
            var first = queue.poll()

            while (!queue.isEmpty() && queue.peek() <= first) {
                queue.remove()
                count++
            }
            result.add(count)
        }
        answer = result.toIntArray()
        return answer
    }
}
