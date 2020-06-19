import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(a, b, c, k) = readLongs

  var ans = 0L
  if (k >= a) {
    ans += a
  } else if (k < a) {
    ans += k
  }

  if (k - a - b >= 0) {
    ans -= k - a - b
  }

  println(ans)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
