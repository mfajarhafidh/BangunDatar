import BangunDatarType.*

fun main(args: Array<String>) {

    println("===========================")
    println("PENGHITUNG BANGUN DATAR")
    println("===========================")

    println("Silahkan pilih angka 1 - 4 dibawah ini untuk melakukan penghitungan luas dan keliling bangun datar")

    println("1. Persegi")
    println("2. Lingkaran")
    println("3. Segitiga")
    println("4. Persegi Panjang")

    println("Silahkan masukkan angka 1 - 4 : ")
    val input = readLine()!!.toInt()
    switchingCase(input)

}

fun switchingCase(input:Int){
    when(input){

        1 -> {
            println("Silahkan masukkan sisi persegi : ")
            val sisi = readLine()!!.toInt()
            val persegi = Persegi(sisi)
            println("Luas Persegi : ${persegi.luasBangunDatar()}, Keliling Persegi : ${persegi.kelilingBangunDatar()}")
        }

        2 -> {
            val lingkaran = Lingkaran()
            println("Silahkan masukkan jari - jari (r) atau diameter (D) lingkaran : ")
            val choose = readLine()!!.toString()
            when(choose){
                "r" -> {
                    println("Masukkan jari - jari lingkaran : ")
                    val r = readLine()!!.toInt()
                    println("Luas Lingkaran : ${lingkaran.luasBangunDatar(r)}, Keliling Lingkaran : ${lingkaran.kelilingBangunDatar(r)}")
                }
                "D" -> {
                    println("Masukkan diameter lingkaran : ")
                    val D = readLine()!!.toDouble()
                    println("Luas Lingkaran : ${lingkaran.luasBangunDatar(D)}, Keliling Lingkaran : ${lingkaran.kelilingBangunDatar(D)}")
                }
            }
        }

        3 -> {
            println("Silahkan masukkan alas segitiga : ")
            val alas = readLine()!!.toInt()
            println("Silahkan masukkan tinggi segitiga : ")
            val tinggi = readLine()!!.toInt()
            println("Silahkan masukkan sisi miring segitiga : ")
            val miring = readLine()!!.toInt()
            val segitiga = Segitiga()
            println("Luas Segitiga : ${segitiga.luasBangunDatar(alas, tinggi)}, Keliling Segitiga : ${segitiga.kelilingBangunDatar(alas, tinggi, miring)}")
        }

        4 -> {
            println("Silahkan masukkan panjang persegi panjang : ")
            val panjang = readLine()!!.toInt()
            println("Silahkan masukkan lebar persegi panjang : ")
            val lebar = readLine()!!.toInt()
            val persegiPanjang = PersegiPanjang(panjang, lebar)
            println("Luas Persegi Panjang : ${persegiPanjang.luasBangunDatar()}, Keliling Persegi Panjang : ${persegiPanjang.kelilingBangunDatar()}")
        }
        else -> println("Silahkan masukkan angka 1 - 4")
    }
}