fun main() {
    val firstBook = Book()
    firstBook.title = "Beloved"
    firstBook.author = "Toni Morrison"
    firstBook.yearPublished = 1987
    val secondBook = BookConstructor(title="Inferno",author="Dante Alighieri",yearPublished=1320,genre="Poem")
    secondBook.getBookInfo()
}
class Book(){
    var title: String = ""
    var author: String =""
    var yearPublished: Int =0

}
class BookConstructor (var title: String, var author: String, var yearPublished: Int, var genre:String) { // i called it BookConstructor to avoid name conflict
    fun getBookInfo(){
        println("$title by $author($yearPublished), Book genre: $genre")
    }
}