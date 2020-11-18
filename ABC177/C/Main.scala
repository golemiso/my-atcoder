import scala.io.StdIn._
import scala.math._
import scala.util.control.Breaks

object Main extends App with StdInHelper {
  val n = readInt
  val as = readLongs

  var result = 0L
  as.combinations(2)
    .foreach {
      case Array(a, b) =>
        result = (result + ((a * b) % 1000000007L)) % 1000000007L
    }

  println(result)
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
