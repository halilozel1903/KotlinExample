/**
 * Created by ozel on 11.8.2017.
 */

class Takim(Ad: String, Kurulus_Tarihi: Int, Degeri: Double, Renkleri: String) { //class tanımı

    init { // class ile ilgili bilgileri ekrana yazdırdık.

        println("Adı : $Ad Kuruluş Tarihi : $Kurulus_Tarihi Değeri : $Degeri Renkleri : $Renkleri")
        println("**************************")
    }
}

fun main() {

    var Besiktas = Takim("Beşiktaş", 1903, 1000000.0, "Siyah-Beyaz") // class a değerler atandı.
    var Trabzonspor = Takim("Trabzonspor", 1967, 15000.0, "Bordo-Mavi")

}