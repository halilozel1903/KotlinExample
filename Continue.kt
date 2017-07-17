/**
 * Created by ozel on 17.7.2017.
 */
fun main(args: Array<String>) {
    /*
    Continue ifadesi verilen koşulu atla ve yoluna devam etmek mantığı ile çalışmaktadır.
     */

    for (sayi in 1..5) {
        if (sayi == 3) continue //sayi 3 olunca 3 ü atla ve yoluna devam et.
        println("sayi: $sayi")
    }
}