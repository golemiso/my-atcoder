import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val k = readInt
  val s = readLine

  if (k < s.length()) {
    println(s.take(k) + "...")
  } else {
    println(s)
  }
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
