import scala.io.StdIn._
import scala.annotation.tailrec

object Main extends App {
  val s = readLine()
  val nums = for {
    i <- 1L to 200000L
  } yield 2019L * i

  var ans = 0L

  @tailrec
  def indexOf(n: String, i: Int): Unit = {
    val idx = s.indexOf(n, i)
    if (0 <= idx) {
      ans += 1
      indexOf(n, idx + 1)
    }
  }

  for (n <- nums) {
    val strn = n.toString()
    if (strn.head.asDigit <= strn.last.asDigit) indexOf(strn, 0)
  }

  println(ans)
}
