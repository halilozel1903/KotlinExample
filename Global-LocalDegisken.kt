/**
 * Created by ozel on 11.8.2017.
 */

var ad_soyad="Halil Özel" // global değişken tanımı

fun ad_goster():Unit{
    println(ad_soyad) // global değişken herhangi bir blokta çağrılabilir.
}

fun main(args: Array<String>) {

    var isim="Halil" // local değişken tanımı
    println("isim : $isim")


    println(ad_soyad) // global değişken herhangi bir blokta çağrılabilir.
    ad_goster()
}