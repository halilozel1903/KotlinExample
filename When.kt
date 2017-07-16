/**
 * Created by ozel on 17.7.2017.
 */
fun main(args: Array<String>) {

    /*
    When ifadesi switch-case yapısına benzemektedir.
    Kotlin de switch-case bulunmamaktadır.
    Koşullar tek tek yazılmakla birlikte toplu olarakta yazılabilir.
    Bir ifade birden fazla koşulu sağlamasına rağmen en baştaki ifadeyi
    doğrulayıp programı sonlandırır.
     */

    var sayi:Int= readLine()!!.toInt()

    when(sayi){
        1-> print("Girilen sayi 1")
        2-> print("Girilen sayi 2")
        3,4-> print("Girilen sayi 3 veya 4")
        in 5..8-> print("Girilen sayi 5 ile 8 arasındadır.")
        !in 5..8-> print("Girilen sayi 5 ile 8 arasında değildir.")
        else -> print("Girilen sayı verilen değerler arasında değildir.")
    }


}