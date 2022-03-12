/**
 * Created by ozel on 17.7.2017.
 */
fun main() {

    /*
    Java dilinde for yapısı : for(int sayi=0;i<=10;i++)
    Kotlin dilinde for yapısı : for(sayi in 1..10)
     */
    for (sayi in 1..10) {
        println("$sayi - Şampiyon Beşiktaş ") //Ekrana 10 defa Şampiyon Beşiktaş yazdırdık
    }

    println("----------------------")

    /*
    Bu örneğimizde string ifadeler ile for kullanımını gördük.
    liste tanımladık ve ona string ifadeler atadık.
    for yardımıyla da isimler ekranda gösterildi.
 */

    val liste = listOf("Halil", "İbrahim", "Yusuf", "Emre")
    for (isim in liste) {
        println("İsminiz : $isim")
    }

}