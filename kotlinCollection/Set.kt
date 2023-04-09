package kotlinCollection
//Rania Nur Hikmah_Mobile_Pagi

fun main(){

    val setItems = mutableSetOf(1, 3, 6, 9, 3, 4)
    setItems.add(7)
    setItems.remove(9)

    println("Setelah di tambahkan 6 dan dihapus 9 : " + setItems)

}

//val setA = setOf(1, 2, 4, 6, 10, 32)
//val setB = setOf(1, 5, 3, 11, 2, 4)
//println("Apakah set A = set B? : " + (setA == setB))
//println("Apakah 32 ada di SetA? : " + (32 in setA))


// intersect dan union
//val list1 = listOf(1, 3, 2, 2, 4, 1, -2)
//val list2 = setOf(1, 1, 2, 2, -2)
//val list3 = mutableListOf(3, 8, 5, 4)

//val intersect = list1 intersect list2
//val union = list1 union list2 union list3
//println("Anggota list 1 dan list 2 yang sama : " + intersect)
//println("Anggota seluruh list : " + union)
