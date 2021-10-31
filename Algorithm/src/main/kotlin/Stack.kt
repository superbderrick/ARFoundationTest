
class Stack<E> (vararg  items : E) {

    private val elements = items.toMutableList()

    fun push(element : E) = elements.add(element)

    fun pop() : E = elements.removeAt(elements.size -1)

    fun peek() : E = elements.last()

    fun size() = elements.size

    fun isEmpty() = elements.isEmpty()

    fun last() = elements.first()

}