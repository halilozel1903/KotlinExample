/**
 * Created by ozel on 17.7.2017.
 */

fun main() {

    /*
    do-while döngüsü while döngüsünden tek farkı koşula bakılmaksızın do nun içindeki
    işlemleri yap ve daha sonra while içindeki koşula bakarak devam et mantığı bulunmaktadır.
     */

    var sayi = 1
    do {
        println("We Love Kotlin") //Ekrana 1 defa We Love Kotlin yazdırıldı.
        sayi++ //Sayı değişkenimizi 1 arttırmasaydık döngü sonsuz döngüye girecekti.
    }while (sayi >= 10) // Koşul sağlanmadığından döngü sonlanacaktır.

}