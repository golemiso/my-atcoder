import scala.io.StdIn._
import scala.util.control.Breaks

object Main extends App with StdInHelper {
  val Array(en, yen) = readLongs

  val n = en.toInt

  val b = new Breaks
  b.breakable {
    for (x <- (0 to n).reverse) {
      for (y <- (0 to n - x).reverse) {
        val z = n - x - y
        if (yen / 1000 == (10 * x) + (5 * y) + z) {
          println(s"$x $y $z")
          b.break
        }
      }
    }
    println(s"-1 -1 -1")
  }
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
