import jdk.nashorn.internal.runtime.regexp.joni.Config.log

/**
 * Created by jeonghyeonji on 2017. 8. 28..
 */
class LinkedList{
    var head: Node? = null
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
        var targetNode = head
        var tailNode = head

        // 마지막 노드
        while (tailNode != null) {
            if (tailNode.next == null) break
            tailNode = tailNode.next as Node
        }

        // 순환될 타겟 노드
        for (i in 1..6) {
            targetNode = targetNode?.next as Node
        }

        tailNode?.next = targetNode

    }

    fun detectLoop(): Boolean {
        var twoStep = head
        var oneStep = head

        while (oneStep != null) {
            // 하나의 노드만 이동한다.
            if (oneStep.next != null) return false
            oneStep = oneStep.next as Node

            // 두개의 노드를 이동
            for (i in 1..2) {
                if (twoStep?.next == null) return false // 루프가 끝난다고한다.
                twoStep = twoStep?.next as Node
            }

            if (oneStep == twoStep) return true
        }

        return true
    }

    fun printAll() {
        var tNode = head
        while (tNode != null) {
            log.print(tNode.item)
            tNode = tNode.next as Node
        }

    }

    inner class Node(val item: Any) {
        var next: Node? = null

    }

}

fun main(args: Array<String>) {
    var list =  LinkedList()
    for (i in 0..10) {
        list.add(i)
    }
    list.makeLoop()

    list.printAll()

}



