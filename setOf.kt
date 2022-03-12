/**
 * Created by ozel on 11.8.2017.
 */
fun main() {

    /*
    Set Collection arayüzünü miras alır.
    Matematikte ki kümelere benzerdir.

     */


    val set_eleman = setOf("Besiktas", "Galatasaray", "Fenerbahce", "Trabzonspor", "Besiktas") // setOf ile değerler atadık.
    // bir değer sadece bir defa atanabilir.
    // setOf metodu eleman eklemeye ve silmeye izin vermez.

    for (eleman in set_eleman)
        println(eleman) // elemanlar yazdırıldı.

    println("****************")

    val set_mut_eleman = mutableSetOf("Besiktas", "Galatasaray", "Fenerbahce", "Trabzonspor", "Besiktas", "Trabzonspor") // mutableSetOf ile değerler atadık.
    // bir değer sadece bir defa atanabilir.
    // mutableSetOf metodu eleman eklemeye ve silmeye izin verir.

    set_mut_eleman.add("Basaksehir") // Basaksehir elaman olarak eklendi.
    set_mut_eleman.remove("Fenerbahce") // Fenerbahce elemanlıktan silindi.

    for (elements in set_mut_eleman)
        println(elements) // elementler yazdırıldı.


}