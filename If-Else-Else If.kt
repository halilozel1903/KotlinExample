/**
 * Created by ozel on 17.7.2017.
 */
/**
 * Created by ozel on 13.7.2017.
 */
fun main(args: Array<String>) {

    /*
    if - else if - else

   - if : eğer verilen koşul doğru ise bu blok içindeki işlemleri yap.
   - else if : if içindeki koşul yanlış ise bir sonraki durumun içindeki işlemleri yap.
   - else : if ve else if içindeki koşullar yanlış ise en son durumdaki işlemler yapılır.
   - Koşul cümlelerinde tek satırlık işlemler var ise {} süslü parantezlere koymaya
    gerek yoktur.

     */
    var sayi1: Int = 5
    var sayi2: Int = 10

    if (sayi1 == sayi2)
        print("Sayi1 Sayi2 ye eşittir.")
    else if (sayi1 > sayi2)
        print("Sayi1 Sayi2 den büyüktür.")
    else
        print("Sayi2 Sayi1 den büyüktür.")

}