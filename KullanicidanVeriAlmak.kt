/**
 * Created by ozel on 13.7.2017.
 */
fun main() {

    print("Adınız :")
    val name = readLine() //Kullanıcıdan string bir değer alındı.
    print("Yaşınız :")
    val age: Int = readLine()!!.toInt() //Kullanıcıdan değer alınırken Int türüne dönüştürüldükten sonra alındı.
    print("Mesleğiniz :")
    val job = readLine() //Kullanıcıdan string bir değer olan meslek alındı.
    print("Maaşınız:")
    val salary: Double = readLine()!!.toDouble() ////Kullanıcıdan değer alınırken Double türüne dönüştürüldükten sonra alındı.

    print("Adı:$name Yaşı:$age Mesleği:$job Maaşı:$salary") //Kullanıcıdan alınan değerler ekranda gösterildi.
}