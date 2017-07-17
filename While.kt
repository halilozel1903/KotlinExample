/**
 * Created by ozel on 17.7.2017.
 */
fun main(args: Array<String>) {

    /*
    Kotlin dilindeki While kullanımı Javada ki kullanıma benzemektedir.
    Aşağıda Kotlin ile yapmış olduğumuz örneği Java da yaptık.
    Java : int sayi=1;
    while(sayi<=10){
    System.out.println(" We love kotlin");
    sayi++;
    }
     */

    var sayi = 1
    while (sayi <= 10) { //sayi değeri 10 dan küçük ve eşit olana dek dön koşulu verildi.
        println("We Love Kotlin")
        sayi++ //Sayı değişkenimizi 1 arttırmasaydık döngü sonsuz döngüye girecekti.
    }

}