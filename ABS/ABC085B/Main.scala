import scala.io.StdIn._

object Main extends App {
  val n = readInt
  val ds = for { _ <- 1 to n } yield { readInt }

  var ans = ds.distinct.length

  println(ans)
}
