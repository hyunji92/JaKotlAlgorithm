package algorithmstudy

import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import java.util.*

fun main(args: Array<String>) {

    var testCase: Int

    var a: Int
    var b: Int
    var scanner = Scanner(System.`in`)

    testCase = scanner.nextInt()
    //log.print("test1  : " + testCase)
    for (i in 0..testCase) {
        //log.print("test2  : " + testCase)
        a = scanner.nextInt()
        b = scanner.nextInt()

        println(a + b)
    }
}