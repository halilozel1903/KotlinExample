/**
 * Created by ozel on 22.7.2017.
 */
fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("Halil") //array liste eleman ekler.
    arrayList.add("İbrahim")
    arrayList.add("Özel")


    arrayList.get(0) //0.indis getirilir.
    arrayList.set(2, "Emre") //2.indisteki eleman değişti.

    for (arrayListShow in arrayList) { //elemanlar yazdırılır.
        println(arrayListShow)
    }


    if (arrayList.contains("Özel")) //bu içeriğin olup olmadığını tarar.
        println("Eleman bulundu.")
    else
        println("Eleman bulunamadı.")



    for (index in 0..arrayList.size - 1) {
        println(arrayList.get(index)) //array list elemanlarını getirir.
    }
}