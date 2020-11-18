import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val s = readLine()
  val t = readLine()

  var count = t.length
  for (i <- 0 to s.length - t.length) {
    val ss = s.substring(i, i + t.length)
    var c = 0
    for (i <- 0 to t.length - 1) {
      if (ss.charAt(i) != t.charAt(i)) {
        c += 1
      }
    }
    if (c < count) {
      count = c
    }
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
