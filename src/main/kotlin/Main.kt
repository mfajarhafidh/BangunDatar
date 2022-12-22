fun main(args: Array<String>) {
    println("Penghitung luas Segitiga")
    println("Masukkan alas : ")
    val alas = readLine()!!.toInt()
    println("Masukkan tinggi : ")
    val tinggi = readLine()!!.toInt()
    println("Hasil : ${segitiga(alas, tinggi)}")
}

fun segitiga(alas: Int, tinggi: Int)=0.5 * alas * tinggi