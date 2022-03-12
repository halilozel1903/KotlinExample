/**
 * Created by ozel on 11.8.2017.
 */

class Araba(Turu:String,Modeli:Int,Fiyati:Double,Km:Int,Sahibi:String){ // Araba adında bir class oluşturuldu.

    var Sahibi:String?=null
    var Fiyati:Double?=null
    var Km:Int?=null

    init {

        println("Turu : $Turu Modeli : $Modeli Fiyati : $Fiyati Km : $Km Sahibi : $Sahibi")

        this.Sahibi=Sahibi // oluşturulan değişkeni rahatça kullanabilmek için this işaretçisi kullanıldı.
        this.Fiyati=Fiyati
        this.Km=Km
    }

    fun fiyatGoster():Double{ // arabanın fiyatını bulan bir fonksiyon tanımlandı.

        return (this.Fiyati!! -(this.Km!!.toDouble()))*10
    }

    fun sahibiGoster():String?{ // arabanın sahibini gösteren bir fonksiyon tanımlandı.

        return this.Sahibi
    }

}

fun main(args: Array<String>) {

    val Halil_Araba=Araba("Audi Q7",2015,1000000.0,150000,"Halil Özel")
    val İbrahim_Araba=Araba("Ferrari",2000,1800000.0,160000,"İbrahim Özel")

    println("------------------------------------")
    println("Halil'in arabasının fiyatı : ${Halil_Araba.fiyatGoster()}") // Halil'in arabasının fiyatı gösterildi.
    println("Ferrari'nin sahibi : ${İbrahim_Araba.sahibiGoster()}") //Ferrari'nin sahibi gösterildi.

}