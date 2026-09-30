
package library

/** Entry point: simulates a day at the library. */
object Main {
  def main(args: Array[String]): Unit = {

    /* ===== Test Book =====
    val book = new Book("Dune", "Frank Herbert", 1965, "Science fiction")

    println(book.description())
    println("1st borrow: " + book.borrow())
    println("2nd borrow: " + book.borrow())
    println(book.description())
    println("1st return: " + book.returnItem())
    println("2nd return: " + book.returnItem())
    println(book.description())
    */

    /* ===== Test Magazine and Comic =====
    val magazine = new Magazine("National Geographic", "NatGeo Society", 2024, 312)
    val comic = new Comic("Astérix le Gaulois", "Goscinny & Uderzo", 1961, 1)

    println(magazine.description())
    println(comic.description())
    comic.borrow()
    println(comic.description())
    */

    /* ===== Test User =====
    val dune = new Book("Dune", "Frank Herbert", 1965, "Science fiction")
    val asterix = new Comic("Astérix le Gaulois", "Goscinny & Uderzo", 1961, 1)

    val alice = new User("Alice")
    val bob = new User("Bob")

    println("Alice borrows Dune: " + alice.borrowDocument(dune))
    println("Bob borrows Dune: " + bob.borrowDocument(dune))
    println("Bob borrows Asterix: " + bob.borrowDocument(asterix))

    alice.listBorrowedDocuments()
    bob.listBorrowedDocuments()

    println("Bob returns Dune: " + bob.returnDocument(dune))
    println("Alice returns Dune: " + alice.returnDocument(dune))

    alice.listBorrowedDocuments()
    */

    /* ===== Test Library =====
    val library = new Library()

    val dune = new Book("Dune", "Frank Herbert", 1965, "Science fiction")
    val natgeo = new Magazine("National Geographic", "NatGeo Society", 2024, 312)

    library.addDocument(dune)
    library.addDocument(natgeo)

    val alice = new User("Alice")
    library.addUser(alice)

    library.listAvailableDocuments()
    alice.borrowDocument(dune)
    library.listAvailableDocuments()

    println("Number of documents: " + library.getDocuments.size)
    println("Number of users: " + library.getUsers.size)
    */

    // ===== Final simulation =====
    println("=== Library system started ===\n")

    // 1. Create the library
    val library = new Library()

    // 2. Add documents
    val dune = new Book("Dune", "Frank Herbert", 1965, "Science fiction")
    val lotr = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy")
    val natgeo = new Magazine("National Geographic", "NatGeo Society", 2024, 312)
    val asterix = new Comic("Astérix le Gaulois", "Goscinny & Uderzo", 1961, 1)

    library.addDocument(dune)
    library.addDocument(lotr)
    library.addDocument(natgeo)
    library.addDocument(asterix)

    // 3. Register users
    val alice = new User("Alice")
    val bob = new User("Bob")

    library.addUser(alice)
    library.addUser(bob)

    println(s"Catalogue: ${library.getDocuments.size} documents, ${library.getUsers.size} users\n")
    library.listAvailableDocuments()

    // 4. Borrowing
    println("\n--- Borrowing ---")
    println(s"Alice borrows Dune: ${alice.borrowDocument(dune)}")
    println(s"Alice borrows Asterix: ${alice.borrowDocument(asterix)}")
    println(s"Bob borrows Dune: ${bob.borrowDocument(dune)}") // already borrowed by Alice
    println(s"Bob borrows National Geographic: ${bob.borrowDocument(natgeo)}")

    println()
    alice.listBorrowedDocuments()
    bob.listBorrowedDocuments()
    println()
    library.listAvailableDocuments()

    // 5. Returns
    println("\n--- Returns ---")
    println(s"Bob returns Dune: ${bob.returnDocument(dune)}") // not his, refused
    println(s"Alice returns Dune: ${alice.returnDocument(dune)}")
    println(s"Bob borrows Dune again: ${bob.borrowDocument(dune)}")

    println()
    alice.listBorrowedDocuments()
    bob.listBorrowedDocuments()
    println()
    library.listAvailableDocuments()
  }
}