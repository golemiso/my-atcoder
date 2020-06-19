import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(n, m, x) = readInts

  case class Book(price: Int, rikaido: Array[Int]) {
    def +(that: Book): Book =
      Book(
        this.price + that.price,
        rikaido.zipWithIndex.map(r => r._1 + that.rikaido(r._2))
      )
  }

  val books = for {
    _ <- 1 to n
  } yield {
    val sankosho = readInts
    Book(sankosho.head, sankosho.tail)
  }

  var min = -1
  for (i <- 1 to n) {
    books.toSeq
      .combinations(i)
      .foreach { b =>
        val sum =
          b.foldLeft(Book(0, (for { _ <- 1 to m } yield { 0 }).toArray))(_ + _)
        if (sum.rikaido.forall(_ >= x)) {
          if (min == -1) {
            min = sum.price
          } else if (min > sum.price) {
            min = sum.price
          }
        }
      }
  }
  println(min)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
