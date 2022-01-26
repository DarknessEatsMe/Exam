class DLlist<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var middle: Node<T>? = null
    override fun toString(): String = if(head == null) "empty list" else head.toString()
    /** Добавление элемента в голову связного списка. **/
    fun Dpush(value: T) {
        val node = Node(value)
        head?.prev = node
        node.next = head
        head = node
        node.prev = null
        if (tail == null) {
            tail = node
        }
    }

    /** Удаление элемента из головы связного списка. **/
    fun Dpop(): T? {
        val value = head?.value
        head = head?.next
        head?.prev = null
        if (head == null) {
            tail = null
        }
        return value
    }

    fun dequeue(): T? = Dpop()

    /** Добавление в хвост. **/
    fun enqueue(value: T) {
        if(tail == null) {
            Dpush(value)
        } else {
            val node = Node(value)
            node.prev = tail
            tail?.next = node
            tail = node
        }
    }

    /** Удаление элемента из хвоста связного списка. **/
    fun removeLast(): T? {
        val value = tail?.value
        tail = tail?.prev
        tail?.next = null
        if (tail == null) {
            head = null
        }
        return value
    }

    fun DmiddleSearch(value: T): T? {
        middle = head
        while (middle?.value != value && middle?.value != null){
            middle = middle?.next
        }
        return middle?.value
    }

    fun DmiddlePush(search: T, value: T) {
        val node = Node(value)
        DmiddleSearch(search)
        if (middle == null) {
            node.next = head
            head?.prev = node
            head = node
            node.prev = null
        } else {
            node.next = middle?.next
            node.prev = middle
            (middle?.next)?.prev = node
            middle?.next = node
        }
    }

    fun DmiddlePop(value: T): T? {
        DmiddleSearch(value)
        (middle?.prev)?.next = middle?.next
        (middle?.next)?.prev = middle?.prev
        return middle?.value
    }

    fun Dpeek(): T? {
        return head?.value
    }

    val isEmpty: Boolean get() = Dpeek() == null

    val isNotEmpty: Boolean get() = !isEmpty
}