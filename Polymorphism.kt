/**
 * Created by ozel on 11.8.2017.
 */

/*

Polimorfizm bir nesne farklı nesneler gibi davranır.
Bir nesne farklı sınıflardan oluşturulmuş nesneleri yüklenebilir.

 */


fun goster(deger: Int) {

    println("değer : $deger")
}

fun goster(deger: Double) {

    println("değer : $deger")
}

fun goster(deger: String) {

    println("değer : $deger")
}

fun main() {

    goster(58)
    goster(19.03)
    goster("halil")

}