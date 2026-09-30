package library

object Main {
  def main(args: Array[String]): Unit = {
    println("Library system started")
// test book
/* 
    val book = new Book("jspp", "Nourimane", 2002, "Sc fi")

    println(book.description())
    println("1st borrow: " + book.borrow())
    println("2nd borrow: " + book.borrow())
    println(book.description())
    println("1st return: " + book.returnItem())
    println("2nd return: " + book.returnItem())
    println(book.description())  */

// test magazine et comic
/*  
    val magazine = new Magazine("National Geographic", "NatGeo Society", 2024, 312)
    val comic = new Comic("Astérix le Gaulois", "Goscinny & Uderzo", 1961, 1)

    println(magazine.description())
    println(comic.description())
    comic.borrow()
    println(comic.description())*/
//tests users
/*  
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

    alice.listBorrowedDocuments() */
// tests class library
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
  }
}
