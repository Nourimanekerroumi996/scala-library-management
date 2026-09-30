package library

/** The library: holds all documents and registered users. */
class Library {

  private var documents: List[Document] = List()
  private var users: List[User] = List()

  /** Adds a document to the catalogue. */
  def addDocument(doc: Document): Unit = {
    documents = documents :+ doc
  }

  /** Registers a new user. */
  def addUser(user: User): Unit = {
    users = users :+ user
  }

  /** Prints every document that is not currently borrowed. */
  def listAvailableDocuments(): Unit = {
    val available = documents.filter(doc => !doc.isBorrowed)
    if (available.isEmpty) {
      println("No documents available")
    } else {
      println("Available documents:")
      available.foreach(doc => println("  - " + doc.description()))
    }
  }

  // Getters
  def getDocuments: List[Document] = documents
  def getUsers: List[User] = users
}