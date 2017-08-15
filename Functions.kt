/**
 * Created by ozel on 11.8.2017.
 */

fun toplama_yap(number1: Int, number2: Int): Int // int tipinde değer döndüren bir fonksiyon oluşturduk.
{
    var sonuc = number1 + number2
    return sonuc
}

fun sayi_goster(number1: Int = 0): Unit // Değer döndürmeyen fonksiyon oluşturuldu. Void in karşılığı Kotlin'de Util dir.
{
    println("sayi : " + number1)
}

fun selam_ver() { //parametresiz bir fonksiyon oluşturduk ve ekrana mesaj bastırdık.
    println("Hello Guys")
}

fun main(args: Array<String>) {

    println("10+25 = " + toplama_yap(10, 25))
    sayi_goster(1903)
    selam_ver() // fonksiyona sabit olarak 0 değeri atandığı için sonuç 0 olarak ekranda gözüktü.
}