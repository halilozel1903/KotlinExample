/**
 * Created by ozel on 11.8.2017.
 */
fun main() {

    val map = hashMapOf(1 to "Halil", 2 to "Yusuf", 5 to "Veli") // map lere hashmapOf metoduyla değerler atandı.
    map.put(17, "Lens")

    for (item in map) { // map e atanan değerler ekranda gösterildi.
        println(item)
    }

    println("-------------------")

    val array = arrayOf(58, 42, 34, 35) //array e arrayOf mmetoduyla değerleri atandı.

    println(array[2]) // 2.indisin değeri yazıldı.

    println("-------------------")

    val list = mutableListOf(10, 20, 30, 40, 50) // list i mutableListOf metoduyla kullanarak değişikliklere izin verildi.
    list[2] = 100 // list in 2.indisi değiştirildi.

    for (item in list) { // list e atanan değerler ekranda gösterildi.
        println(item)
    }

}