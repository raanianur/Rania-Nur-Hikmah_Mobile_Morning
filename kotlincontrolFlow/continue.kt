
//Rania Nur Hikmah

fun main() {
    println("\nExample 1 \t\t: ")
    val listInt = listOf(1, 2, null, 4, 5, null, 9, 13, null, 24)
    for (i in listInt) {
        if (i == null) continue
        print(i)
    }

    println("\n\nExample 2 \t\t: ")
    println("Print odd numbers")
    for (i in 1..30) {
        if (i % 3 == 0) {
            continue
        }
        println("$i is an odd number")
    }
}