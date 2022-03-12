/**
 * Created by ozel on 17.7.2017.
 */
fun main() {

    /*

      *
      **
      ***
      ****
      *****

      Yıldızlar kullanılarak üçgen elde edilen bir program için
      iç içe for döngüsünden yararlanıldı.

     */

    for (x in 1..5) { //1 den 5 e kadar x değeri arttırıldı.
        println("") //İstenilen şekil elde edilmesi için alt satıra geçildi.
        for (y in 1..x) { // y değeri x e kadar arttırıldı.
            print("*") //Yıldızlar ekrana bastırıldı.
        }
    }

}