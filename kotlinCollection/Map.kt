package kotlinCollection
//Rania Nur Hikmah_Mobile_Pagi

fun main(){
    val groupMap = mapOf(
        1 to "Group 1",
        2 to "Group 2",
        3 to "Group 3",
        4 to "Group 4",
        5 to "Group 5",
        6 to "Group 6",
        7 to "Group 3",
    )
    println("\nMenampilkan semua : \n" +groupMap)
    val mutableGroupMap = groupMap.toMutableMap()
    println("\nMengubah menjadi mutableMap : \n"
            +mutableGroupMap)
    mutableGroupMap[1] = "Group satu"
    mutableGroupMap.put(8, "Group 8")
    println("\nHasil perubahan group 1 dan menambah " +
            "group 8 :\n" + mutableGroupMap)
}