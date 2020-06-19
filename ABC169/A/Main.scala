import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(a, b) = readInts
  println(a * b)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
