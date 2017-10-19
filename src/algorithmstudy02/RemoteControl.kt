package algorithmstudy02

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val wNum = BooleanArray(10)

    val wrongRemoteCount = scanner.nextInt()
    var wrongNum  = scanner.nextInt()
    val channal = scanner.nextInt()

    for (i in 0 until channal){
        wNum[wrongRemoteCount] = true;  //고장난 리모콘
    }

}