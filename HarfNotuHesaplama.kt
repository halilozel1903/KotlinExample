/**
 * Created by ozel on 16.7.2017.
 */
fun main(args: Array<String>) {

    /*
    Bu örneğimizde kullanıcıdan vize ve final notunu alıp ortalama puanını
    bularak harf notunu bulmak.
    Harf notu Vizenin %40 ı ile Finalin %60 ı alınarak hesaplanmıştır.
     */

    print("Vize notunuzu giriniz :")
    var vize: Int = readLine()!!.toInt()
    print("Final notunuzu giriniz :")
    var final: Int = readLine()!!.toInt()

    var not = (vize * 0.4) + (final * 0.6)

    if (not < 100 && not >= 70) {
        println("Not ortalaması :$not")
        print("Harf Notunuz : AA")
    } else if (not < 70 && not >= 60) {
        println("Not ortalaması :$not")
        print("Harf Notunuz : BB")
    } else if (not < 60 && not >= 50) {
        println("Not ortalaması :$not")
        print("Harf Notunuz : CC")
    } else if (not < 50 && not >= 40) {
        println("Not ortalaması :$not")
        print("Harf Notunuz : DD")
    } else if (not < 40 && not >= 0) {
        println("Not ortalaması :$not")
        print("Harf Notunuz : FF")
    }

}