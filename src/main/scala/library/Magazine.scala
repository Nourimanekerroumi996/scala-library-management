package library

//magazine, identifie par edition number
class Magazine(title: String, author: String, year: Int, val editionNumber: Int)
    extends Document(title, author, year) {

  override def description(): String = {
    val status = if (isBorrowed) "borrowed" else "available"
    s"Magazine: $title by $author ($year) - edition #$editionNumber - $status"
  }
}