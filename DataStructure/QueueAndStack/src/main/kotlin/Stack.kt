class Stack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun pop() = elements.removeAt(elements.size -1)

    fun size() = elements.size

    fun isEmpty() = elements.isEmpty()


}