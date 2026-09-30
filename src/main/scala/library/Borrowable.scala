package library

// Contract for anything that can be borrowed and returned. 
trait Borrowable {
  def borrow(): Boolean
  def returnItem(): Boolean
}