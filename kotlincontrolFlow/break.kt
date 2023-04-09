
//Rania Nur Hikmah

fun main() {

    println("\nExample 1 \t\t: ")
    var i = 0
    while (true) {
        println("Break $i")
        i++
        if (i > 10) {
            break
        }
    }

    val c = 2
    for (b in 1..10) {
        println("Sayang...")
        if(b == c) {
            println("Putus!")
            break
        }
    }

    val g = 2
    for (f in 1..20) {
        println("Ayo Semangat")
        if(f == g) {
            println("Jangan Semangat")
            break
        }
    }
}