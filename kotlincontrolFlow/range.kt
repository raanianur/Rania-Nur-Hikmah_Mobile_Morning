
//Rania Nur Hikmah

fun main() {
    val rangeInt = 1..15
    println(rangeInt.toList())
    println("Step: " + rangeInt.step)

    println("\t\t\t--.rangeTo()--")
    println("\nMenggunakan rangeTo()\t\t: ")
    val rangeInts = 1.rangeTo(10)
    println("Step: "+ rangeInts.step)
    print (rangeInts.toList())

    println("\n\n\t\t\t--Step--")
    println("\nMenggunakan step\t\t: ")
    val rangeIntz = 1..10 step 2
    println("Step: ${rangeIntz.step}")
    print (rangeIntz.toList())

    println("\n\t\t\t--rangeTo()--")
    println("\nMenggunakan rangeTo()\t\t: ")
    var i = 4
    if (i in 1.rangeTo(16)) {
        println("Value 4 available in Range")
    }

    println("\n\t\t\t--downTo()--")
    println("\nMenggunakan downTo()\t\t: ")
    var j = 30
    if (j in 20.downTo(1)) {
        println("Value 4 is not available in Range")
    }

}