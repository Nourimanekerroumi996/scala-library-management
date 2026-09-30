package library

// Un book is characterised by genre 
class Book(title: String, author: String, year: Int, val genre: String) // val avec genre car les autres ont deja val dans doc
    extends Document(title, author, year) {    //heritage de doc

  override def description(): String = {  
    val status = if (isBorrowed) "borrowed" else "available"
    s"Book: $title by $author ($year) - genre: $genre - $status" 
  }
}