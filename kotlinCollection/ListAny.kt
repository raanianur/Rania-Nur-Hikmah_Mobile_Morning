package kotlinCollection
//Rania Nur Hikmah_Mobile_Pagi

fun main(){
    val numberList = mutableListOf(false, "siji", 2, 12.5)
    println("List campuran : " +numberList)

    numberList.remove(false)
    println("setelah 'false' dihapus : " + numberList)
    numberList.set(2,3)
    println("Index 2 diubah angka 3 : " + numberList)
    numberList[0] = 1
    println("index 0 diganti angka 1: " + numberList)
    numberList.add(3,"papat")
    println("index 3 diisi 'papat' : " + numberList)

}