import scala.io.StdIn._

object Main extends App {
  val a = readInt()
  val Array(b, c) = readLine().split(" ").map(_.toInt)
  val s = readLine()

  println(s"${a + b + c} $s")
}
