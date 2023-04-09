
//Rania Nur Hikmah

fun main() {
    println("\t\t\tLoop for range Expression")

    println("\nFor untuk Range Expressions \t\t: ")
    for (i in 1..30){
        println("Value is $i")
    }

    println("\n\t\t\tloop for iteration array")
    println("\nFor untuk Range Expressions \t\t: ")
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for (day in days) {
        println(day)
    }

    println("\n\t\t\tloop for with index")
    println("\nFor dengan withIndex \t\t: ")
    val dayz = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for ((index, value) in dayz.withIndex()) {
        println("value $value with index $index")
    }

    println("\n\t\t\tloop for with ForEach")
    println("\nFor dengan forEach \t\t: ")
    val daye = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    daye.forEach { value-> println("Day is $value") }

    println("\n\t\t\tloop for with for EachIndexed")
    println("\nFor dengan forEachIndexed \t\t: ")
    val dayc = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    dayc.forEachIndexed { index, value -> println("Day $value with index: $index") }

}