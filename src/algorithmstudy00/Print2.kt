package algorithmstudy00

import java.util.*

fun Print2(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    while (scanner.hasNextLine()){
        var text = scanner.nextLine()
        if (text.length <= 100){
            println(text)
        }
    }

}