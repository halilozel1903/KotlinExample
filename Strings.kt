import java.util.*

/**
 * Created by ozel on 17.7.2017.
 */
fun main() {

    /*
    Kotlin dilinde değişkene ekranda göstermenin 3 türlü yolu vardır.
    Aşağıdaki örnekte bu gösterimlere yer verilmiştir.
     */
    val mesaj = " We Love Kotlin Programming "
    println(mesaj)
    println("Mesajınız: $mesaj")
    println("Mesajınız: $mesaj")

    val ad = "Halil" + "İbrahim" //2 string ifade birleştirilebilir.
    println("Adınız :$ad") //Adınız :Halilİbrahim

    println("Mesajın 6.karakteri : ${mesaj[5]}") //mesajın 6.karakteri yazdırılır.
    println("Mesajın Küçük Harf Kullanımı : ${mesaj.lowercase(Locale.getDefault())}") //harfler küçük harfe çevrilir.
    println("Mesajın Büçük Harf Kullanımı : ${mesaj.uppercase(Locale.getDefault())}") //harfler büyük harfe çevrilir.
    println("Split özelliği : ${mesaj.split(" ")}") //boşluklardan sonra elemanlara ayırır.
    println("Trim özelliği :${mesaj.trim()}") //baştaki ve sondaki boşluklar silinir.

}