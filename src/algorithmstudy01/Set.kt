package algorithmstudy01

import java.io.BufferedOutputStream
import java.io.PrintWriter
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val runCount = scanner.nextInt()

    val out = PrintWriter(BufferedOutputStream(System.out))
    val L = LinkedList<String>()
    var x: String? = null

    val S = (1..20).mapTo(LinkedList()) { it.toString() + "" }

    for (z in 0..runCount) {
        val sample = scanner.next()
        if (sample != "all" && sample != "empty") {
            x = scanner.nextLine()
        }

        when (sample) {
            "add" -> if (L.contains(x)) {
                L.add(x.toString())
            }
            "remove" -> if (L.contains(x)) {
                L.remove(x.toString())
            }
            "check" -> if (L.contains(x)) {
                println(1)
            } else {
                println(0)
            }
            "toggle" -> if (L.contains(x)) {
                L.remove(x.toString())
            } else {
                L.add(x.toString())
            }
            "all" -> {
                L.clear()
                L.addAll(S.toList())
            }
            "empty" -> L.clear()

        }

        out.flush()

    }
}


