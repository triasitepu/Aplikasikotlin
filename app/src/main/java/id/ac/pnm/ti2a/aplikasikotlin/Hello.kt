package id.ac.pnm.ti2a.aplikasikotlin



fun main(args: Array<String>) {
    biodata("Tria Wilujeng Rahayu br Sitepu", institusi = "Teknologi Informasi",Hobby="Membaca", Desc = "Saya suka membaca webtoon,wattpad,AU Universe,saya selalu membaca disaat ada waktu luang .")
}

fun biodata(nama:String, institusi:String, Hobby:String, Desc: String, kelas:String = "2A") {
    println("Nama  : $nama")
    println("Prodi : $institusi")
    println("Kelas : $kelas")
    println("Hobby : $Hobby")
    println("$Desc")
}


