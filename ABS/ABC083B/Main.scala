import scala.io.StdIn._

object Main extends App {
  val Array(n, a, b) = readLine().split(" ").map(_.toInt)

  def sum(i: Int): Int = i.toString().map(_.asDigit).sum

  var ans = 0

  for (i <- 1 to n) {
    val s = sum(i)
    if (a <= s && s <= b) ans += i
  }

  println(ans)
}
