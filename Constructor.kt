import javax.jws.WebParam

/**
 * Created by ozel on 11.8.2017.
 */
class Arabam(){ // Arabam adında bir class oluşturuldu.

    var Sahibi:String?=null
    var Fiyati:Double?=null
    var Km:Int?=null

    constructor(Turu:String,Modeli:Int,Fiyati:Double,Km:Int,Sahibi:String ):this() { // class ın yapıcısında değerler tanımlandı.

        println("Turu : $Turu Modeli : $Modeli Fiyati : $Fiyati Km : $Km Sahibi : $Sahibi")

        this.Sahibi=Sahibi // oluşturulan değişkeni rahatça kullanabilmek için this işaretçisi kullanıldı.
        this.Fiyati=Fiyati // oluşturulan değişkeni rahatça kullanabilmek için this işaretçisi kullanıldı.
        this.Km=Km // oluşturulan değişkeni rahatça kullanabilmek için this işaretçisi kullanıldı.
    }

    constructor(Modeli: Int):this(){ // yapıcı fonksiyon tek bir parametre de alabilir.
        println("Arabanın modeli  : "+Modeli) // arabanın modeli yazdırıldı.
    }

    fun fiyatGoster():Double{ // arabanın fiyatını bulan bir fonksiyon tanımlandı.

        return (this.Fiyati!! -(this.Km!!.toDouble()))*10 // araba fiyatını formulüze ettik.
    }

    fun sahibiGoster():String?{ // arabanın sahibini gösteren bir fonksiyon tanımlandı.

        return this.Sahibi // arabanın sahibi döndürüldü.
    }

}

fun main(args: Array<String>) {

    var Halil_Araba=Arabam("Audi Q7",2015,1000000.0,150000,"Halil Özel") // araba ile ilgili bilgiler verildi.
    var İbrahim_Araba=Arabam("Ferrari",2000,1800000.0,160000,"İbrahim Özel") // araba ile ilgili bilgiler verildi.

    println("------------------------------------")
    println("Halil'in arabasının fiyatı : "+Halil_Araba.fiyatGoster()) // Halil'in arabasının fiyatı gösterildi.
    println("Ferrari'nin sahibi : "+İbrahim_Araba.sahibiGoster()) //Ferrari'nin sahibi gösterildi.

    var Ozel_Araba=Arabam(2017) // arabanın modeli verildi.

}