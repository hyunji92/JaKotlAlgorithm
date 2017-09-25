package ttest

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val E = sc.nextInt()
    val S = sc.nextInt()
    val M = sc.nextInt()
    var e = 1
    var s = 1
    var m = 1
    var i = 1
    while (true) {
        if (e == E && s == S && m == M) {
            println(i)
            break
        }
        e += 1
        s += 1
        m += 1
        if (e == 16) {
            e = 1
        }
        if (s == 29) {
            s = 1
        }
        if (m == 20) {
            m = 1
        }
        i++
    }
}