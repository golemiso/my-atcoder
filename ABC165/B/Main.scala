import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val x = readLong

  var deposit = 100L
  var res = 0L
  while (deposit < x) {
    res += 1
    deposit += (deposit * 0.01).toLong
  }

  println(res)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
