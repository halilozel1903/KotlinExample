/**
 * Created by ozel on 17.7.2017.
 */
fun main() {

    val a = 8
    val b = 6
    val min = if (a < b) a else b //Tek satırda minumum bulduk. Kotlin dilinin sağlamış olduğu bir özelliktir.
    println("Minimum :$min") //min değeri ekranda gösterildi.

    print("Lütfen yaşınızı giriniz :")
    val yas: Int = readLine()!!.toInt()
    val ergenmi = when (yas) { //boolean bir değer tutuldu. Şart doğru ise true yoksa false
        in 18..30 -> true
        else -> false
    }
    print("Yaş durumunuz $ergenmi") //ergen olup olmama durumu ekrana bastırıldı.

}