import scala.io.StdIn._

object Main extends App {
  val Array(a, b) = readLine().split(" ").map(_.toInt)
  val ans = if (a * b % 2 == 1) "Odd" else "Even"
  println(ans)
}
