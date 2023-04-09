package kotlinCollection
//Rania Nur Hikmah_Mobile_Pagi

fun main() {
    val numberList = listOf(2, 4, 1, 6, 8, 12, 10, 9)
    val hackerCar = listOf('h', 'u', 'y', 'e', 'a', 'g', 'q')

    val ascendingSort1 = numberList.sorted()
    val ascendingSort2 = hackerCar.sorted()
    val descendingSort1 = numberList.sortedDescending()
    val descendingSort2 = hackerCar.sortedDescending()

    println("\t\t\t Sorting\n")
    println("Ascending Angka : " + ascendingSort1)
    println("Ascending Huruf : " + ascendingSort2)
    println("Descending Angka : " + descendingSort1)
    println("Descending Huruf : " + descendingSort2)

}

//    val numberList = listOf(1, 2, 4, 5, 11, 9, 14, 15, 35, 22)
//    val eventList = numberList.filter { it % 2 == 0 }
//    val notEventList = numberList.filterNot { it % 2 ==0 }
//
//    println("\t\t\tFilter and FilterNot\n")
//    println("List beri nomor : " + numberList)
//    println("filter angka genap : " + eventList)
//    println("filter angka ganjil : " +notEventList)

//    val numbeList = listOf(1, 3, 4, 5)
//
//    val mutipliedBy5 = numbeList.map { it * 5 }
//
//    println("\t\t\tPerkalian\n")
//    println("List nomor : "+numbeList)
//    println("Perkalian dengan 5 : " +mutipliedBy5)


//    val days = arrayOf("Monday", "Tuesday", "Wednesday",
//        "Thrusday","Friday","Saturday","Sunday")
//    val totalDays = days.count()
//
//    print("Total hari : " +totalDays)


//    val numberList = listOf(2, 6, 9, 11, 28, 31, 22, 24, 10)
//    val oddNumber = numberList.find { it % 2 == 1 }
//    val firstOrNulNumber = numberList.firstOrNull{ it % 2 == 3 }
//    val lastOrNullNumber = numberList.lastOrNull{ it % 2 == 3 }
//    println("Hasil find : " + oddNumber)
//    println("Hasil first : " + firstOrNulNumber)
//    println("Hasil last : " + lastOrNullNumber)


//    val days = arrayOf("Monday", "Tuesday", "Wednesday",
//      "Thrusday","Friday","Saturday","Sunday")
//    val firstData = days.first()
//    val latestData = days.last()
//
//    println("\t\t\tfirst dan last\n")
//    println("Hari pertama : " + firstData)
//    println("Hari terakhir : " + latestData)

//    val numberlist = listOf(5, 6, 8, 13, 4, 1, 9)
//
//    val total = numberlist.sum()
//    print("Jumlah angka dalam list : " + total)