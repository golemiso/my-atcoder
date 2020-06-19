import scala.io.StdIn._

object Main extends App {
  val n = readInt()
  val items = for {
    i <- 1 to n
  } yield readLine()
  println(items.distinct.length)
}
