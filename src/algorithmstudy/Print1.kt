package algorithmstudy

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    while (scanner.hasNextLine()){
        var text = scanner.nextLine()
        if (text.isNotEmpty() || text.length <= 100){
            println(text)
        }
    }

}