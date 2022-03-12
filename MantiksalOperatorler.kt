/**
 * Created by ozel on 16.7.2017.
 */
/**
 * Created by ozel on 13.7.2017.
 */
fun main() {

    /*

    TRUE : 1
    FALSE : 0

    AND işlemi her iki parametre true ise işlem true dur.
    diğer kalan bütün işlemler false dur.
    a && b sonuc
    0    0  0
    0    1  0
    1    0  0
    1    1  1

    VEYA işlemi herhangi bir parametrenin true olması işlemin
    true olmasını sağlar.
    a || b sonuc
    0    0  0
    0    1  1
    1    0  1
    1    1  1


     */


    println(5 > 4 && 10 != 8) // 1 && 1 = 1
    println(11 < 9 || 6 > 7)  // 0 || 0 = 0
    println(1903 == 3091) // 0
    println(19 != 91) //1
    println(2 > 1) //1
    println(111 < 22) //0


}