/**
 * Created by ozel on 11.8.2017.
 */

/*
Her fonksiyon farklı görevler yapar ve onlara göre isimlendirilir.
Fakat farklı işlevler yapan ama aynı isme sahip olan fonksiyonlara aşırı yüklenmiş fonksiyon denir.
Overloading de fonksiyonların parametre tipleri ve parametre sayıları  birbirinden farklı olması gerekir.
 */

fun cikarma(sayi1: Int, sayi2: Int): Int {
    return sayi1 - sayi2
}

fun cikarma(sayi1: Int, sayi2: Int, sayi3: Int): Int {
    return sayi1 - sayi2 - sayi3
}


fun main(args: Array<String>) {

    println(cikarma(10, 5))
    println(cikarma(10, 5, 10))

}