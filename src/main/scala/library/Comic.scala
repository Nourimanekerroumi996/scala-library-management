package library

//comic identified by its volume in the series.
class Comic(title: String, author: String, year: Int, val seriesVolume: Int)
    extends Document(title, author, year) {

  override def description(): String = {
    val status = if (isBorrowed) "borrowed" else "available"
    s"Comic: $title by $author ($year) - volume $seriesVolume - $status"
  }
}