package id.ac.pnm.ti2a.aplikasikotlin

import android.graphics.Color
class Book(var pages: Int, var color: String = "Blue") {
    var bookOfColor: String = color
    val numberOfPages: Int = pages
    var isForSale: Boolean = false

    fun updateColor(newColor: String) {
        this.bookOfColor = newColor
    }

    fun putOnSale(status: Boolean) {
        this.isForSale = status
    }
}

fun main() {
    val book1 = Book(pages=120, color="blue")
    println("Buku 1 berwarna ${book1.bookOfColor}")
    println("Buku 1 memiliki ${book1.numberOfPages} halaman" )
    book1.updateColor("Red")
    println("Buku 1 setelah diupdate menjadi warna ${book1.bookOfColor}")

}