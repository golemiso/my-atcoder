import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(n, k) = readInts

  var sunuke = (1 to n).toIndexedSeq

  for (_ <- 1 to k) {
    val d = readInt
    val as = readInts
    as.foreach { a => sunuke = sunuke.filterNot(_ == a) }
  }

  println(sunuke.length)
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
