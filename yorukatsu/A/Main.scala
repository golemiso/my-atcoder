import scala.io.StdIn._

object Main extends App {
  val s = readLine
  println(s.map {
    case '+' => 1
    case _   => -1
  }.sum)
}
