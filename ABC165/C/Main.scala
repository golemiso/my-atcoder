import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(n, m, q) = readInts
  var res = 0L
  for (_ <- 1 to q) {
    val Array(a, b, c, d) = readLongs
    if (b - a == c && res > d) {
      res = d
    }
  }
  println(res)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
