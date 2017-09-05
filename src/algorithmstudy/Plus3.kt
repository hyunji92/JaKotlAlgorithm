package algorithmstudy

import java.util.*

fun main(args: Array<String>) {

    var testCase: Int

    var a: Int
    var b: Int
    val scanner = Scanner(System.`in`)

    testCase = scanner.nextInt()

    for (i in 0 until testCase) {

        a = scanner.nextInt()
        b = scanner.nextInt()

        println(a + b)
    }
}