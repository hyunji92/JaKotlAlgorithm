package algorithmstudy

import java.util.*

fun main(args: Array<String>) {
    var a: Int
    var b: Int
    val scanner = Scanner(System.`in`)

    do {
        a = scanner.nextInt()
        b = scanner.nextInt()
        if (a == 0 && b == 0) {
            return
        } else {
            System.out.println(a + b)
        }
    } while (scanner.hasNextInt())

}