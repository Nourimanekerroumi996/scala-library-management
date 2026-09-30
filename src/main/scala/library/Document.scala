package library

// Base class shared by every document in the library. 
abstract class Document(val title: String, val author: String, val year: Int) extends Borrowable {

  var isBorrowed: Boolean = false

  def description(): String  //methode abstraite

  def borrow(): Boolean = {
    if (!isBorrowed) {
      isBorrowed = true
      true
    } else {
      false
    }
  }

  def returnItem(): Boolean = {
    if (isBorrowed) {
      isBorrowed = false
      true
    } else {
      false
    }
  }
}