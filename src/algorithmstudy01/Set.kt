package algorithmstudy01

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val runCount = scanner.nextInt()

    var S: LinkedList<String>? = null
    var L: LinkedList<String>? = null

    var x:String? = null

    for (i in 1..20) {
        S?.add(i.toString() + "")
    }

    for(z in 0..runCount){
        var sample = scanner.next()
        if (!sample.equals("all") && !sample.equals("empty")){
            x = scanner.nextLine()
        }
        if (sample.equals("add")){

            if(L?.contains(x)!!){
                L?.remove(x)
            }
        }


    }

    fun add(x: Int){
        if (x in 1 .. 20){
            S?.find { it.isNotEmpty() }

        }
    }

}


