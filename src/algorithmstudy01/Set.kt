package algorithmstudy01

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val runCount = scanner.nextInt()

    var S: LinkedList<String>? = null
    var L: LinkedList<String>? = null

    var sample = scanner.next()
    var x      = scanner.nextInt()

    for (i in 1..20) {
        S?.add(i.toString() + "")
    }

    for(z in 0 until runCount){
        if (sample.equals("add")){



        } else if (sample.equals("remove")){

        }


    }

    fun add(x: Int){
        if (x in 1 .. 20){
            S?.find { it.isNotEmpty() }

        }
    }

}


