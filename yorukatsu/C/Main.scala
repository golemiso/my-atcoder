import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val x = readLong
  val s = x / 11L
  val m = x % 11L

  println(s * 2 + (if (m == 0) 0 else if (m <= 6) 1 else 2))
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
