/**
 * Created by ozel on 17.7.2017.
 */
fun main(args: Array<String>) {

    var a: Int = 8
    var b: Int = 6
    var min = if (a < b) a else b //Tek satırda minumum bulduk. Kotlin dilinin sağlamış olduğu bir özelliktir.
    println("Minimum :" + min) //min değeri ekranda gösterildi.

    print("Lütfen yaşınızı giriniz :")
    var yas: Int = readLine()!!.toInt()
    var ergenmi = when (yas) { //boolean bir değer tutuldu. Şart doğru ise true yoksa false
        in 18..30 -> true
        else -> false
    }
    print("Yaş durumunuz $ergenmi") //ergen olup olmama durumu ekrana bastırıldı.

}