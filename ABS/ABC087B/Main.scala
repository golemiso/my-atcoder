import scala.io.StdIn._

object Main extends App {
  val a = readInt() // 500
  val b = readInt() // 100
  val c = readInt() // 50
  val x = readInt()

  var ans = 0L

  for (ia <- 0 to a) {
    for (ib <- 0 to b) {
      for (ic <- 0 to c) {
        if ((ia * 500) + (ib * 100) + (ic * 50) == x) ans += 1
      }
    }
  }

  println(ans)
}
