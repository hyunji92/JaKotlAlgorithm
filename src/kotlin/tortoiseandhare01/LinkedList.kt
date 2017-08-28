package kotlin.tortoiseandhare01

/**
 * Created by jeonghyeonji on 2017. 8. 28..
 */
class LinkedList() {
    lateinit var head: Node
    var node: Node? = null

    fun add(item: Any) {
        if (node == null) {
            node = Node(item)
            head = node as Node
            return
        }
        node?.next = Node(item)
        node = node?.next

    }

    fun makeLoop() {
        val targetNode = head
        val tailNode = head

        // 마지막 노드
        while (tailNode){

        }

    }

    inner class Node(val item: Any) {
        var next: Node? = null
    }
}