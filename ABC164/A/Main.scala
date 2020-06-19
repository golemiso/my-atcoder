import scala.io.StdIn._

object Main extends App {
  val Array(s, w) = readLine().split(" ").map(_.toInt)
  println(if (s <= w) "unsafe" else "safe")
}
