package algorithmstudy00

import java.util.*


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    /*var str = scanner.nextLine()

    for (i in 0 until str.length){
        //println(str[i])
        if ((i+1) % 10 == 10){
            println("%n")
        }
    }
*/
    val input = scanner.nextLine()

    var cnt = 0
    for (c in input) {
        cnt++
        print(c)
        if (cnt == 10) {
            println()
            cnt = 0
        }
    }

    //val arrayList = ArrayList<String>()
//    for (s in input) {
//        println("string : " + s)
//    }

}
