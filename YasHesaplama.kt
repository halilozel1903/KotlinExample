import java.util.* //bütün java util sınıflarını kullanabilmek için * işareti ile import edildi.
/**
 * Created by ozel on 16.7.2017.
 */

fun main(args: Array<String>) {

    print("Hangi yılda doğdunuz : ") //kullanıcıdan doğum yılı istendi.

    var dogum_yili:Int= readLine()!!.toInt() //kullanıcıdan doğum yılı istendi.

    var suanki_yil:Int=Calendar.getInstance().get(Calendar.YEAR) //Calendar sınıfı yardımıyla şuan ki yıl öğrenildi.

    var yas:Int=suanki_yil-dogum_yili //yaş hesaplandı.

    print("Siz $yas yaşındasınız.") //kullanıcının yaşı ekrana basıldı.

}