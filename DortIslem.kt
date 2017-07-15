/**
 * Created by ozel on 13.7.2017.
 */
fun main(args: Array<String>) {

    var number1: Int = 10 //sayi1'e 10 değeri atandı.
    var number2: Int = 5 //sayi2'ye 5 değeri atandı.


    var addition: Int? = number1 + number2 //değeri null döndürülebilir.
    println("$number1 + $number2 = $addition") //toplama işlemi yapıldı.

    var subtraction: Int = number1 - number2
    println("$number1 - $number2 = $subtraction") //çıkarma işlemi yapıldı.

    var multiplication: Int = number1 * number2
    println("$number1 * $number2 = $multiplication") //çarpma işlemi yapıldı.

    var division: Int = number1 / number2
    println("$number1 / $number2 = $division") //bölme işlemi yapıldı.

}