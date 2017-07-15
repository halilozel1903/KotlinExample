/**
 * Created by ozel on 15.7.2017.
 */
/**
 * Created by ozel on 13.7.2017.
 */
fun main(args: Array<String>) {

    /*
    arttırma ve azaltma operatörleri toplam da 4 tanedir.
    Önden arttırma , önden azaltma , arkadan arttırma ve arkadan azaltma.
    Önden arttırma ve azaltmalarda ilk önce arttırılır ya da azaltılır sonra işleme girer.
    Arkadan arttırma ve azaltmalarda ise ilk işleme girer sonra arttırma ya da azaltma yapılır.
     */

    var sayi1:Int=5

    println("sayi1:"+(sayi1)) //sayi1 : 5
    println("sayi1:"+(sayi1++)) //sayi1 : 5
    println("sayi1:"+(++sayi1)) //sayi1 : 7
    println("*******")
    println("sayi1:"+(sayi1)) //sayi1 : 7
    println("sayi1:"+(sayi1--)) //sayi1 : 7
    println("sayi1:"+(--sayi1)) //sayi1 : 5
}