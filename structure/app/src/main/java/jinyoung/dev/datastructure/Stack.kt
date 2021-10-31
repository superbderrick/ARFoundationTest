package jinyoung.dev.datastructure

class Stack<E>(vararg items : E) {
    //push,pop,isEmpty,peek
    private val elements = items.toMutableList()

    fun push(element : E) = elements.add(element)
    fun pop(element : E) = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun peek() = elements.last()
    fun size() = elements.size

    override fun toString(): String {
        return "MutableStack(${elements.joinToString()})"
    }

}