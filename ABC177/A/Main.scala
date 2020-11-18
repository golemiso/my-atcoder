import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(d, t, s) = readInts
  if (d <= s * t) {
    println("Yes")
  } else {
    println("No")
  }
}

trait StdInHelper {
  def readStrings = readLine.split(" ")
  def readInts = readStrings.map(_.toInt)
  def readLongs = readStrings.map(_.toLong)
  def readDoubles = readStrings.map(_.toDouble)
  def readBigInts = readStrings.map(BigInt.apply(_))
  def readBigDecimals = readStrings.map(BigDecimal.apply(_))
}
