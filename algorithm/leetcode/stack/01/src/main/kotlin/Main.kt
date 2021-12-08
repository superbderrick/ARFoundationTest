fun main(args: Array<String>) {
    var s = "(a(b) (c) (d(e(f)g)h) I (j(k)l)m)";
    System.out.println(Depth.maxDepth(s.trim()));

}

class Depth {

    companion object {
        fun maxDepth(strings:String) : Int {
            var current_max = 0
            var max = 0
            var n = strings.length
            var stack = MutableStack(strings)

            for(i: Int in 0.. n-1 step(1)) {
                if (strings[i] == '(') {
                    current_max ++
                    stack.push(strings[i])

                    if (current_max > max) {
                        max = current_max
                    }
                } else if (strings[i] == ')') {
                    var char = stack.pop()
                    if(current_max > 0 && char =='(') {
                        current_max --
                    } else {
                        return  -1
                    }
                }
            }
            if(stack.isEmpty()) {
                return -1
            }

            return max;
        }
    }

}

class MutableStack(var items: String) {
    private val elements = items.toMutableList()

    fun push(element: Char) = elements.add(element)
    fun peek() : Char = elements.last()
    fun pop() : Char = elements.removeAt(elements.size -1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size



}