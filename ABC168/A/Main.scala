import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val n = readInt
  val i = n % 10
  i match {
    case 2 | 4 | 5 | 7 | 9 => println("hon")
    case 0 | 1 | 6 | 8     => println("pon")
    case 3                 => println("bon")
  }
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
