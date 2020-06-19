import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(x, n) = readInts
  val ps = readInts

  var finish = false

  var i = 0
  while (!finish) {
    if (!ps.contains(x - i)) {
      println(x - i)
      finish = true
    } else if (!ps.contains(x + i)) {
      println(x + i)
      finish = true
    }
    i += 1
  }
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
