import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val n = readInt
  var res = 0L
  if (n % 3 != 0 && n % 5 != 0) res
  else n
  println(
    if (n % 3 == 0 && n % 5 == 0) "FizzBuzz"
    else if (n % 3 == 0) "Fizz"
    else if (n % 5 == 0) "Buzz"
    else n
  )
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
}
