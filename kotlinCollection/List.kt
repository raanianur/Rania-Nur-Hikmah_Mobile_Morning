package kotlinCollection
//Rania Nur Hikmah_Mobile_Pagi

fun main() {
    val numberList = mutableListOf("Setunggal", "Kalih", "Tigo",
        "Sekawan", "Gangsal")
    println("Sebutkan nomor 1-5 dalam bahasa Jawa " +
            "Krama : " + numberList)

    numberList[2] = "Telu"
    println("Ubah nomor 3 menjadi 'Telu' : "+numberList)

}