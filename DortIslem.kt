/**
 * Created by ozel on 13.7.2017.
 */
fun main() {

    var number1 = 10 //sayi1'e 10 değeri atandı.
    var number2 = 5 //sayi2'ye 5 değeri atandı.


    val addition: Int = number1 + number2 //değeri null döndürülebilir.
    println("$number1 + $number2 = $addition") //toplama işlemi yapıldı.

    val subtraction: Int = number1 - number2
    println("$number1 - $number2 = $subtraction") //çıkarma işlemi yapıldı.

    val multiplication: Int = number1 * number2
    println("$number1 * $number2 = $multiplication") //çarpma işlemi yapıldı.

    val division: Int = number1 / number2
    println("$number1 / $number2 = $division") //bölme işlemi yapıldı.

}