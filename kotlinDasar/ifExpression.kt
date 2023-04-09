
//Rania Nur Hikmah

fun main() {

    println("\n\t\tIf Statement\t\t")
    val condition = false

    if (condition) {
        println("code block to be executed if condition is true")
    } else {
        println("code block to be executed if condition is false")
    }

    println("\n\t\tIf else Expression\t\t")
    val timeOpen = 7
    val timeClose = 15
    val timeNow = 10

    val classStatus = if (timeNow >= timeClose) {
        "Class already closed"
    } else if(timeNow >= timeOpen) {
        "Class is open"
    } else {
        "Class is not open yet"
    }
    println("Jam 10 sekarang : " +classStatus)
}