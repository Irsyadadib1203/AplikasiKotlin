package com.example.aplikasikotlin
fun main(args: Array<String>) {
    biodata("Irsyad Adib Ahsani")
    hobby("Renang","saya suka berenang karena mempunyai banyak manfaat baik untuk tubuh")
}

fun biodata(nama: String, kelas:String = "2A"){ // minimal 2 parameter/args
    val biodata = """
        -----------------------------
        *        BIODATA SAYA       *
        -----------------------------
        nama = $nama
        kelas = $kelas 
    """
    print(biodata)
}

fun hobby(nama:String, desc:String){ // 2 parameter
    val hobby = """
        -----------------------------
        *        HOBBY SAYA       *
        -----------------------------
        Hobby = $nama
        desc = $desc 
    """
    println(hobby)

}