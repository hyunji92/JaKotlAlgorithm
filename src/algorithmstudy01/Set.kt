package algorithmstudy01

import java.io.BufferedOutputStream
import java.io.PrintWriter
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val runCount = scanner.nextInt()

    val out = PrintWriter(BufferedOutputStream(System.out))
    val L = LinkedList<String>()
    var x:String? = null

    val S = (1..20).mapTo(LinkedList<String>()) { it.toString() + "" }

    /* 위처럼 코딩이 가능
    val S = LinkedList<String>()
    for (i in 1..20) {
           S.add(i.toString() + "")
       }
    */

    for(z in 0..runCount){
        var sample = scanner.next()
        if (!sample.equals("all") && !sample.equals("empty")){
            x = scanner.nextLine()
        }
        if (sample.equals("add")){
            if(L.contains(x)){
                L.add(x.toString())
            }
        } else if (sample.equals("remove")){
            if(L.contains(x)){
                L.remove(x.toString())
            }
        } else if (sample.equals("check")){
            if(L.contains(x)){
                println(1)
            }else{
                println(0)
            }
        } else if (sample.equals("toggle")){
            if(L.contains(x)){
                L.remove(x.toString())
            }else{
                L.add(x.toString())
            }
        } else if (sample.equals("all")){
            L.clear()
            L.addAll(S.toList())
        } else if (sample.equals("empty")){
            L.clear()
        }

    }

    out.flush()

}


