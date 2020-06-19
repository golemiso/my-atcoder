import scala.io.StdIn._

object Main extends App {
  val mod: Long => Long = _ % 1000000007L
  val Array(n, k) = readLine().split(" ").map(_.toInt)

  def sum(l: Long, r: Long): Long = {
    (l + r) * (r - l + 1) / 2
  }

  var ans = 0L
  for {
    i <- k to n + 1
  } yield {
    val min = sum(0, i - 1)
    val max = sum(n - i + 1, n)
    ans = mod(ans + (max - min + 1))
  }
  println(ans)
}
