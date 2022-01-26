class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var middle: Node<T>? = null
    override fun toString(): String = if(head == null) "empty list" else head.toString()
    fun push(value: T) {
        val node = Node(value)
        node.next = head
        head = node
        if (tail == null) {
            tail = node
        }
    }
    fun pop(): T? {
        val value = head?.value
        head = head?.next
        if (head == null) {
            tail = null
        }
        return value
    }
    fun middlePush(search: T, value: T) {
        middle = head
        val node = Node(value)
        while (middle?.value != search && middle?.value != null){
            middle = middle?.next
        }
        if (middle == null) {
            node.next = head
            head = node
        } else {
            node.next = middle?.next
            middle?.next = node
        }
    }
    fun peek(): T? {
        return head?.value
    }
    fun last(): T? {
        return tail?.value
    }

    val isEmpty: Boolean get() = peek() == null

    val isNotEmpty: Boolean get() = !isEmpty
}