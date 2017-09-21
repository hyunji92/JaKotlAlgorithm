package algorithmstudy01

import java.util.*

fun PrevPermutation(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val arr = IntArray(num)

    for (i in 0 until num) {
        arr[i] = scanner.nextInt()
    }

    var i = num -1
    while (i>0 && arr[i-1] <= arr[i]){
        i--
    }

    if (i <= 0){
        println(-1)
    } else {
        var j = num -1
        while (j >= i && arr[j] >= arr[i-1]){
            j--
        }
        var temp = arr[i-1]
        arr[i-1] = arr[j]
        arr[j] = temp

        j = num -1 // 위에도 있는데 다시 선언한 이유는?
        while (i < j) {
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            i++
            j--
        }

        for(k in 0 until num){
            print(arr[k].toString() + " ")
        }
    }

}