import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val k = readInt
  val Array(a, b) = readInts

  var res = "NG"
  for (i <- a to b) {
    if (i % k == 0) {
      res = "OK"
    }
  }

  println(res)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
