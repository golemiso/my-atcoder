import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val s = readLine().toCharArray()
  val t = readLine().toCharArray()

  var count = 0
  for (i <- 0 to s.length - 1) {
    if (s(i) != t(i)) count += 1
  }

  println(count)
}

trait StdInHelper {
  def readStrings = readLine.split(" ")
  def readInts = readStrings.map(_.toInt)
  def readLongs = readStrings.map(_.toLong)
  def readDoubles = readStrings.map(_.toDouble)
  def readBigInts = readStrings.map(BigInt.apply(_))
  def readBigDecimals = readStrings.map(BigDecimal.apply(_))
}
