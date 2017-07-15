/**
 * Created by ozel on 13.7.2017.
 */
fun main(args: Array<String>) {

    /*
    İşlem Öncelik Sırası
    1-() parantez işlemi
    2- ^ üslü işlemler
    3- /(bölme) ve *(çarpma) işlemleri
    4- +(toplama) ve -(çıkarma) işlemleri
    5- =
     */

    var sayi1: Int = 12
    var sayi2: Int = 6
    var sonuc: Int? //boş değer dönderebilir.

    sonuc = (sayi1 + sayi2) * sayi1 + 10 - sayi2 //işlem önceliğine göre işlemler yapılır.

    print("sonuc : " + sonuc)

}