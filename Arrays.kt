/**
 * Created by ozel on 21.7.2017.
 */
fun main(args: Array<String>) {

    var dizi = Array<Int>(3) { 0 } //boyutu 3 ve değerleri 0 olan dizi tanımlandı.
    dizi[0] = 1 //dizinin 0.indisinin değeri güncellendi.
    dizi[1] = 5 //dizinin 1.indisinin değeri güncellendi.
    dizi[2] = (dizi[0] * dizi[1]) + 4 //dizinin 2.indisi matematiksel işlemler sonucu yenilendi.

    for (array in dizi) {
        println("dizinin değeri : $array") //dizinin değerleri gösterildi.
    }


    for (index in 0..2) {

        println("Dizi [$index] :  " + dizi[index]) //indislerde ekranda gösterildi.

    }

    var StrDizi = Array<String>(3) { "" } //String türünde dizi tanımlaması yapıldı.

    for (str in 0..2) {
        print("StrDizi[$str] :")
        StrDizi[str] = readLine()!! //String ifadeleri kullanıcıdan almak için kullanıldı.
    }


    for (str in 0..2) {
        println("StrDizi[$str] :" + StrDizi[str]) //dizinin indisi ve değerleri ekranda gösterildi.

    }


}