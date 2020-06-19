import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(n, m) = readInts
  val map = readLongs.zipWithIndex.map { case (h, i) => (i + 1, h) }.toMap
  var hs = scala.collection.mutable.Map((1 to n).map(i => (i, 0)): _*)

  var res = 0L
  for (_ <- 1 to m) {
    val Array(a, b) = readInts
    if (map(a) < map(b)) hs -= a
    else if (map(b) < map(a)) hs -= b
    else {
      hs -= a
      hs -= b
    }
  }
  println(hs.size)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
