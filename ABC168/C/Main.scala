import scala.io.StdIn._
import scala.math._

object Main extends App with StdInHelper {
  val Array(a, b, h, m) = readDoubles

  val radM = 360d * m / 60d
  val radH = radM / 12d + 360d * h / 12d

  val cc = pow(a, 2) + pow(b, 2) - 2d * a * b * cos(toRadians(radM - radH))
  println(String.format("%.10f", pow(cc, 0.5)))
}

trait StdInHelper {
  def readInts = readLine.split(" ").map(_.toInt)
  def readLongs = readLine.split(" ").map(_.toLong)
  def readDoubles = readLine.split(" ").map(_.toDouble)
}
