package algorithmstudy01

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num = sc.nextInt()
    val arr = IntArray(num)
    for (i in 0 until num) {
        arr[i] = i + 1
        print(arr[i].toString() + " ")
    }
    println()

    while (nextArr(arr)) {
        for (i in 0 until num) {
            print(arr[i].toString() + " ")
        }
        println()
    }
}

fun nextArr(arr: IntArray): Boolean {
    var i = arr.size - 1
    while (i > 0 && arr[i - 1] >= arr[i]) {
        i--
    }
    if (i <= 0) {
        return false
    }

    var j = arr.size - 1
    while (j >= i && arr[j] <= arr[i - 1]) {
        j--
    }

    var temp = arr[i - 1]
    arr[i - 1] = arr[j]
    arr[j] = temp

    j = arr.size - 1
    while (i < j) {
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i++
        j--
    }
    return true
}
