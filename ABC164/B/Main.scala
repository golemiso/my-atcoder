import scala.io.StdIn._

object Main extends App {
  var Array(a, b, c, d) = readLine().split(" ").map(_.toInt)

  var takahashi = false
  var loop: Boolean = true
  while (loop) {
    c -= b
    if (c <= 0) {
      takahashi = true
      loop = false
    }

    a -= d
    if (a <= 0) {
      loop = false
    }
  }

  println(if (takahashi) "Yes" else "No")
}
