/**
 * Created by ozel on 13.7.2017.
 */
fun main() {

    /*
    İşlem Öncelik Sırası
    1-() parantez işlemi
    2- ^ üslü işlemler
    3- /(bölme) ve *(çarpma) işlemleri
    4- +(toplama) ve -(çıkarma) işlemleri
    5- =
     */

    val sayi1 = 12
    val sayi2 = 6
    val sonuc: Int? //boş değer dönderebilir.

    sonuc = (sayi1 + sayi2) * sayi1 + 10 - sayi2 //işlem önceliğine göre işlemler yapılır.

    print("sonuc : $sonuc")

}