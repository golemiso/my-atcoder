import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val n = readLine()

  println(if (n.contains("7")) "Yes" else "No")
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
