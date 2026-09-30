package library

/** A library member who can borrow and return documents. */
class User(val name: String) {

  private var borrowedDocs: List[Document] = List()

  /** Borrows a document if it is available. */
  def borrowDocument(doc: Document): Boolean = {
    if (doc.borrow()) {
      borrowedDocs = borrowedDocs :+ doc
      true
    } else {
      false
    }
  }

  /** Returns a document, only if this user is the one who borrowed it. */
  def returnDocument(doc: Document): Boolean = {
    if (borrowedDocs.contains(doc) && doc.returnItem()) {
      borrowedDocs = borrowedDocs.filter(d => d != doc)
      true
    } else {
      false
    }
  }

  /** Prints the documents currently borrowed by this user. */
  def listBorrowedDocuments(): Unit = {
    if (borrowedDocs.isEmpty) {
      println(s"$name has no borrowed documents")
    } else {
      println(s"$name's borrowed documents:")
      borrowedDocs.foreach(doc => println("  - " + doc.description()))
    }
  }
}