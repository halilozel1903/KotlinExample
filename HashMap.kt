/**
 * Created by ozel on 11.8.2017.
 */
fun main() {

    /*
    HashMap Map arayüzünün bir örneğidir.
    HashMap sınıfı her elemana karşılık bir anahtar değeri saklar.
    Anahtar değerler ve veriler sıralı olmak zorunda değildir.

     */

    val map = HashMap<Int, String>() // map adında hashmap oluşturuldu. Anahtar-Değer

    map.put(1, "Halil") //map değerleri atandı.
    map.put(2, "İbrahim")
    map.put(58, "Özel")

    println(map[58]) // map 58 anahtarlı değeri ekranda gösterildi.

    for (k in map.keys)
        println(map[k]) //map değerleri ekranda gösterildi.

}