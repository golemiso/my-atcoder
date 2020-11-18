import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val n = readInt
  val as = readInts

  val maxA = as.max
  val dp = scala.collection.mutable.Map[Int, Int]().withDefaultValue(0)

  for (a <- as) {
    for (i <- a to maxA by a) {
      dp(i) += 1
    }
  }

  var res = 0

  for (a <- as) {
    if (dp(a) == 1) res += 1
  }

  println(res)
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
