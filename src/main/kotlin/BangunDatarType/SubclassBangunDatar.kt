package BangunDatarType

class Persegi(private var sisi : Int): BangunDatar(){
    override fun luasBangunDatar(): Int {
        return sisi*sisi
    }

    override fun kelilingBangunDatar(): Int{
        return sisi+sisi
    }
}

class Lingkaran : BangunDatar(){

    fun luasBangunDatar(r : Int) : Double{
        return 3.14*r*r
    }
    fun luasBangunDatar(D : Double) : Double{
        return 0.25*3.14*D*D
    }

    fun kelilingBangunDatar(r : Int) : Double{
        return 2*3.14*r
    }
    fun kelilingBangunDatar(D : Double) : Double{
        return 3.14*D
    }
}

class Segitiga : BangunDatar(){
    fun luasBangunDatar(alas: Int, tinggi: Int): Int {
        return alas*tinggi/2
    }

    fun kelilingBangunDatar(alas: Int, tinggi: Int, miring:Int): Int{
        return alas+tinggi+miring
    }
}

class PersegiPanjang(private val panjang : Int, private val lebar : Int): BangunDatar(){
    override fun luasBangunDatar(): Int {
        return panjang*lebar
    }

    override fun kelilingBangunDatar(): Int{
        return (panjang+lebar)*2
    }
}