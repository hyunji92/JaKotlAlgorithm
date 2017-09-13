package algorithmstudy00

import java.util.*

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)

    var a: Int = scanner.nextInt()
    var b: Int = scanner.nextInt()

    if (a in 1..100) {
        for(i in 0 until a){
            a = i + a--
        }
        println("test :  " + a )

    }
}

