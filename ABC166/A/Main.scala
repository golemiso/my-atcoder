import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val s = readLine()

  println(if (s == "ABC") "ARC" else "ABC")
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
