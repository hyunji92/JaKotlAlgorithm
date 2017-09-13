package algorithmstudy00

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    for (i in 0 until scanner.nextInt()) {
        println(scanner.next().split(",").map { it.toInt() }.reduce { a, b -> a + b })
    }
}
    /* for (i in 0 until testCase) {
        //a = scanner.nextInt()
        //b = scanner.nextInt()

        var temp = scanner.next()
        var tempArray = temp.split(",").map { it.toInt() }.reduce(a, b -> a+b)
        //println(tempArray[0].toInt() + tempArray[1].toInt())
        //println(tempArray)

    }*/
