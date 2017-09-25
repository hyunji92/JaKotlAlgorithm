package algorithmstudy02

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val E = scanner.nextInt()
    val S = scanner.nextInt()
    val M = scanner.nextInt()

    var e = 0
    var s = 0
    var m = 0
    var count  =0

    var i = 0
    while (true) {
        if (e == E && s == S && m == M) {
            println(i)
            break
        }

        if (e == 16) {
            e = 1
        }
        if (s == 29) {
            s = 1
        }
        if (m == 20) {
            m = 1
        }
        if (e == E && s == S && m == M) {
            System.out.println(count)
            break
        }

        e++
        s++
        m++
        count++

    }


}