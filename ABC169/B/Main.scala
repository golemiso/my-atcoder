import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val n = readInt
  val as = readBigInts

  if (as.contains(BigInt(0))) {
    println(0)
  } else {
    var res = BigInt(1)
    val b = new scala.util.control.Breaks
    b.breakable {
      for (a <- as) {
        res = res * a
        if (BigInt(pow(10, 18).toLong) < res) {
          res = BigInt(-1)
          b.break
        }
      }
    }
    println(res)
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
