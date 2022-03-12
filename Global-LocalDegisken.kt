/**
 * Created by ozel on 11.8.2017.
 */

var ad_soyad = "Halil Özel" // global değişken tanımı

fun ad_goster() {
    println(ad_soyad) // global değişken herhangi bir blokta çağrılabilir.
}

fun main() {

    val isim = "Halil" // local değişken tanımı
    println("isim : $isim")


    println(ad_soyad) // global değişken herhangi bir blokta çağrılabilir.
    ad_goster()
}