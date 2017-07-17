/**
 * Created by ozel on 17.7.2017.
 */
fun main(args: Array<String>) {

    /*
    break ifadesi diğer programlama dillerinde olduğu gibi Kotlin'de de kullanımı aynıdır.
    koşula break ifadesi konulduğunda o kısımda programı kırar ve programı sonlandırmış olur.
     */

    for (sayi in 1..8) {

        if (sayi == 5) { //eğer sayımız 5 olunca döngüden çık emri verildi.
            break
        }
        println("sayı : $sayi") //sayi : 1,2,3 ve 4 olarak ekranda gösterildi.
    }

    println("**********")

    /*
    İç içe for döngüsünde break komutunu tüm programa etki etmesi için loop@ etiketi
    kullanılmalıdır.
     */

    loop@ for (sayi1 in 1..5) { //Her iki for'a etki etmesi için loop etiketi kullanıldı.
        for (sayi2 in 1..3) {
            println("sayi1:" + sayi1) //koşullara göre ekranda sayi:1 2 defa yazılmış oldu.
            if (sayi2 == 2) break@loop
        }

    }


}