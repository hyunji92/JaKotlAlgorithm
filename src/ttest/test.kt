package ttest

import java.util.Scanner

object a10972 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val num = Integer.parseInt(sc.nextLine())
        val arr = IntArray(num)

        for (i in 0..num - 1) {
            arr[i] = sc.nextInt()
        }

        var i = num - 1
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--
        }

        if (i <= 0) {
            println(-1)
        } else {
            var j = num - 1
            while (j >= i && arr[j] <= arr[i - 1]) {
                j--
            }

            var temp = arr[i - 1]
            arr[i - 1] = arr[j]
            arr[j] = temp

            j = num - 1
            while (i < j) {
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
                i++
                j--
            }
            for (k in 0..num - 1) {
                print(arr[k].toString() + " ")
            }
        }
    }
}
