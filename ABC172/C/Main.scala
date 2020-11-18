import scala.io.StdIn._
import scala.math._
import scala.util.control.Breaks

object Main extends App with StdInHelper {
  val Array(n, m, k) = readLongs
  val as = readLongs
  val bs = readLongs

  var min = 0L
  var totalBooks = 0
  var aBooks = 0
  var bBooks = 0
  while (aBooks < n) {
    min = as.take(aBooks).sum
    if (min < k) {
      aBooks += 1
    }

    while (bBooks < m && min < k) {
      min = bs.take(bBooks).sum
      if (min < k) {
        bBooks += 1
      }
    }

    if (totalBooks < aBooks + bBooks) {
      totalBooks = aBooks + bBooks
    }
  }

  println(totalBooks)
}

trait StdInHelper {
  def readStrings = {
    val l = readLine
    if (l == "") Array.empty[String]
    else l.split(" ")
  }
  def readInts = readStrings.map(_.toInt)
  def readLongs = readStrings.map(_.toLong)
  def readDoubles = readStrings.map(_.toDouble)
  def readBigInts = readStrings.map(BigInt.apply(_))
  def readBigDecimals = readStrings.map(BigDecimal.apply(_))
}
