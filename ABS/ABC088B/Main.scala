import scala.io.StdIn._

object Main extends App {
  val v = readInt
  val as =
    readLine().split(" ").map(_.toInt).sorted.reverse

  var ans = 0

  for (i <- 0 to as.length - 1) {
    if (i % 2 == 0) {
      ans += as(i)
    } else {
      ans -= as(i)
    }
  }

  println(ans)
}
