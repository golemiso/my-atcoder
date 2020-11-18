import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(a, b, c, d) = readLongs

  var ans: Option[Long] = None
  for (i <- Array(a * c, a * d, b * c, b * d)) {
    if (ans.isEmpty || ans.get < i) {
      ans = Some(i)
    }
  }

  println(ans.get)
}

trait StdInHelper {
  def readStrings = readLine.split(" ")
  def readInts = readStrings.map(_.toInt)
  def readLongs = readStrings.map(_.toLong)
  def readDoubles = readStrings.map(_.toDouble)
  def readBigInts = readStrings.map(BigInt.apply(_))
  def readBigDecimals = readStrings.map(BigDecimal.apply(_))
}
