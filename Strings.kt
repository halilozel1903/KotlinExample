/**
 * Created by ozel on 17.7.2017.
 */
fun main(args: Array<String>) {

    /*
    Kotlin dilinde değişkene ekranda göstermenin 3 türlü yolu vardır.
    Aşağıdaki örnekte bu gösterimlere yer verilmiştir.
     */
    var mesaj = " We Love Kotlin Programming "
    println(mesaj)
    println("Mesajınız: " + mesaj)
    println("Mesajınız: $mesaj")

    var ad = "Halil" + "İbrahim" //2 string ifade birleştirilebilir.
    println("Adınız :" + ad) //Adınız :Halilİbrahim

    println("Mesajın 6.karakteri : " + mesaj[5]) //mesajın 6.karakteri yazdırılır.
    println("Mesajın Küçük Harf Kullanımı : " + mesaj.toLowerCase()) //harfler küçük harfe çevrilir.
    println("Mesajın Büçük Harf Kullanımı : " + mesaj.toUpperCase()) //harfler büyük harfe çevrilir.
    println("Split özelliği : " + mesaj.split(" ")) //boşluklardan sonra elemanlara ayırır.
    println("Trim özelliği :" + mesaj.trim()) //baştaki ve sondaki boşluklar silinir.

}