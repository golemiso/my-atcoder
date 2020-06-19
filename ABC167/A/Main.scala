import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val s = readLine()
  val t = readLine()

  println(if (t.startsWith(s) && s.length() + 1 == t.length()) "Yes" else "No")
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
