/**
 * Created by ozel on 17.7.2017.
 */

fun main(args: Array<String>) {

    var renk1: String = "siyah"
    var renk2: String = "beyaz"

    if (renk1 == "siyah") { //1.koşul doğru ise içindeki 2.koşula bakılır.
        if (renk2 == "beyaz") { //2.koşulda doğru ise ekrana bilgi yazdırılır.
            print("Merhabalar Siz Beşiktaş'lısınız !!!")
        }
    } else { //veriler eşleşmiyorsa bu blok devreye girer ve bilgi ekrana bastırılır.
        print("Hangi takımlı olduğunuz hakkında bir fikrim yok maalesef :(")
    }

}