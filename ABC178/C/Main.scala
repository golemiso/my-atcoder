import scala.io.StdIn._
import scala.math._
import scala.util.control.Breaks

object Main extends App with StdInHelper {
  val n = readInt

  if (n < 2) {
    println(0)
  } else {
    val a = 10
    val b = 9
    val c = 8
    println(pow(a, n))
    println(pow(b, n))
    println(pow(c, n))

    println(pow(a, n) - pow(c, n))
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
  def factorial(x: Long): Long = {
    def fact(x: Long, accumulator: Long): Long = {
      if (x <= 1L) accumulator
      else fact(x - 1L, x * accumulator % mod)
    }
    fact(x, 1L) % mod
  }

  val mod = 1000000007L

}
