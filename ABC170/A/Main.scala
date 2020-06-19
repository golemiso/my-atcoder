import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(x1, x2, x3, x4, x5) = readInts
  if (x1 == 0) println(1)
  if (x2 == 0) println(2)
  if (x3 == 0) println(3)
  if (x4 == 0) println(4)
  if (x5 == 0) println(5)
}

trait StdInHelper {
  def readStrings = readLine.split(" ")
  def readInts = readStrings.map(_.toInt)
  def readLongs = readStrings.map(_.toLong)
  def readDoubles = readStrings.map(_.toDouble)
  def readBigInts = readStrings.map(BigInt.apply(_))
  def readBigDecimals = readStrings.map(BigDecimal.apply(_))
}
